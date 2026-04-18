package model;

/**
 * Data Layer: Payment entity class
 * Represents a payment record with all relevant details.
 */
public class Payment {

    private String paymentIntentId;
    private long amount;
    private String currency;
    private String status;
    private String customerName;
    private String customerEmail;
    private long createdAt;

    /** Default constructor */
    public Payment() {}

    /**
     * Full constructor
     * @param paymentIntentId Stripe Payment Intent ID
     * @param amount Amount in smallest currency unit
     * @param currency ISO currency code
     * @param status Payment status
     * @param customerName Customer full name
     * @param customerEmail Customer email
     */
    public Payment(String paymentIntentId, long amount, String currency,
                   String status, String customerName, String customerEmail) {
        this.paymentIntentId = paymentIntentId;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.createdAt = System.currentTimeMillis() / 1000L;
    }

    public String getPaymentIntentId() { return paymentIntentId; }
    public void setPaymentIntentId(String id) { this.paymentIntentId = id; }
    public long getAmount() { return amount; }
    public void setAmount(long amount) { this.amount = amount; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String name) { this.customerName = name; }
    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String email) { this.customerEmail = email; }
    public long getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return String.format(
                "Payment{id='%s', amount=%.2f %s, status='%s', customer='%s (%s)'}",
                paymentIntentId, amount / 100.0, currency.toUpperCase(),
                status, customerName, customerEmail
        );
    }
}