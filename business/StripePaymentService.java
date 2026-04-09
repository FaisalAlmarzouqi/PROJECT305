package business;

import data.PaymentRepository;
import model.Payment;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**

  Handles all Stripe API calls — create, retrieve, and refund payments.
 */
public class StripePaymentService {

    /** Replace with your Stripe test key from dashboard.stripe.com */
    private static final String STRIPE_SECRET_KEY = System.getenv("STRIPE_SECRET_KEY");
    private static final String STRIPE_API_URL = "https://api.stripe.com/v1";
    private final PaymentRepository repository;

    /**
     * Constructor — inject the data repository.
     * @param repository PaymentRepository instance
     */
    public StripePaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

   
    public Payment createPaymentIntent(long amountInCents, String currency,
                                       String customerName, String customerEmail) {
        System.out.println("\n[Stripe] Creating Payment Intent...");
        try {
            Map<String, String> params = new HashMap<>();
            params.put("amount", String.valueOf(amountInCents));
            params.put("currency", currency.toLowerCase());
            params.put("description", "Payment for " + customerName);
            params.put("receipt_email", customerEmail);
            params.put("automatic_payment_methods[enabled]", "true");

            String response = sendStripeRequest("POST", "/payment_intents", params);
            if (response == null) return null;

            String intentId = extractJsonValue(response, "id");
            String status = extractJsonValue(response, "status");
            String clientSecret = extractJsonValue(response, "client_secret");

            if (intentId == null) return null;

            Payment payment = new Payment(intentId, amountInCents, currency,
                    status, customerName, customerEmail);
            repository.save(payment);

            System.out.println("[Stripe] Success! ID: " + intentId);
            System.out.println("         Status: " + status);
            System.out.println("         Client Secret: " + clientSecret);
            return payment;

        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
            return null;
        }
    }

    /**
     * Retrieves payment status from Stripe.
     * @param paymentIntentId The Payment Intent ID
     * @return Updated Payment object or null
     */
    public Payment retrievePaymentStatus(String paymentIntentId) {
        System.out.println("\n[Stripe] Retrieving: " + paymentIntentId);
        try {
            String response = sendStripeRequest("GET", "/payment_intents/" + paymentIntentId, null);
            if (response == null) return null;

            String status = extractJsonValue(response, "status");
            System.out.println("[Stripe] Status: " + status);
            repository.updateStatus(paymentIntentId, status);
            return repository.findById(paymentIntentId);

        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
            return null;
        }
    }

    /**
     * Issues a full refund for a payment.
     * @param paymentIntentId The Payment Intent ID to refund
     * @return true if refund succeeded
     */
    public boolean refundPayment(String paymentIntentId) {
        System.out.println("\n[Stripe] Refunding: " + paymentIntentId);
        try {
            Map<String, String> params = new HashMap<>();
            params.put("payment_intent", paymentIntentId);

            String response = sendStripeRequest("POST", "/refunds", params);
            if (response == null) return false;

            String refundId = extractJsonValue(response, "id");
            if (refundId != null) {
                System.out.println("[Stripe] Refund ID: " + refundId);
                repository.updateStatus(paymentIntentId, "refunded");
                return true;
            }
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        return false;
    }

    /**
     * Returns all locally stored payments.
     * @return List of Payment objects
     */
    public List<Payment> getAllLocalPayments() {
        return repository.findAll();
    }

    /**
     * Sends HTTP request to Stripe API.
     * @param method GET or POST
     * @param endpoint API endpoint
     * @param params POST body parameters
     * @return Response body string or null
     */
    protected String sendStripeRequest(String method, String endpoint,
                                       Map<String, String> params) throws Exception {
        URL url = new URL(STRIPE_API_URL + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);

        String auth = STRIPE_SECRET_KEY + ":";
        String encodedAuth = java.util.Base64.getEncoder()
                .encodeToString(auth.getBytes(StandardCharsets.UTF_8));
        conn.setRequestProperty("Authorization", "Basic " + encodedAuth);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setConnectTimeout(10_000);
        conn.setReadTimeout(10_000);

        if ("POST".equals(method) && params != null) {
            conn.setDoOutput(true);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> e : params.entrySet()) {
                if (sb.length() > 0) sb.append('&');
                sb.append(URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8));
                sb.append('=');
                sb.append(URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8));
            }
            try (OutputStream os = conn.getOutputStream()) {
                os.write(sb.toString().getBytes(StandardCharsets.UTF_8));
            }
        }

        int code = conn.getResponseCode();
        java.io.InputStream stream = (code >= 200 && code < 300)
                ? conn.getInputStream() : conn.getErrorStream();

        try (Scanner scanner = new Scanner(stream, StandardCharsets.UTF_8)) {
            String body = scanner.useDelimiter("\\A").next();
            if (code >= 400) {
                System.out.println("[Stripe Error " + code + "] " + extractJsonValue(body, "message"));
                return null;
            }
            return body;
        }
    }

    /**
     * Extracts a value from a JSON string by key.
     * @param json Raw JSON string
     * @param key Key to extract
     * @return Value string or null
     */
    private String extractJsonValue(String json, String key) {
        String searchKey = "\"" + key + "\"";
        int keyIndex = json.indexOf(searchKey);
        if (keyIndex == -1) return null;
        int colonIndex = json.indexOf(':', keyIndex);
        if (colonIndex == -1) return null;
        int start = colonIndex + 1;
        while (start < json.length() && Character.isWhitespace(json.charAt(start))) start++;
        if (start >= json.length()) return null;
        char firstChar = json.charAt(start);
        if (firstChar == '"') {
            int end = json.indexOf('"', start + 1);
            return (end != -1) ? json.substring(start + 1, end) : null;
        }
        int end = start;
        while (end < json.length() && json.charAt(end) != ','
                && json.charAt(end) != '}' && !Character.isWhitespace(json.charAt(end))) end++;
        return json.substring(start, end);
    }
}
