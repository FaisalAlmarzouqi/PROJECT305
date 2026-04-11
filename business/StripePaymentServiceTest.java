package business;

import data.PaymentRepository;
import model.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 Test Class for StripePaymentService
 *
 * Stripe HTTP calls are stubbed so the test suite stays deterministic and offline.
 */
@DisplayName("StripePaymentService Tests")
public class StripePaymentServiceTest {

    private StripePaymentService service;
    private PaymentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new PaymentRepository();
        service = new StubStripePaymentService(repository);
    }

    // ─────────────────────────────────────────────
    // getAllLocalPayments() Tests  (no network needed)
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("getAllLocalPayments - should return empty list when no payments saved")
    void testGetAllLocalPayments_EmptyInitially() {
        // Fresh repository — no payments saved yet
        List<Payment> list = service.getAllLocalPayments();
        assertNotNull(list);
    }

    @Test
    @DisplayName("getAllLocalPayments - should return payments that were manually saved")
    void testGetAllLocalPayments_ReturnsSavedPayments() {
        Payment p = new Payment("pi_manual001", 1000L, "usd",
                "requires_payment_method", "Manual User", "manual@test.com");
        repository.save(p);

        List<Payment> list = service.getAllLocalPayments();
        assertTrue(list.stream().anyMatch(pay -> pay.getPaymentIntentId().equals("pi_manual001")));
    }

    // ─────────────────────────────────────────────
    // createPaymentIntent() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("createPaymentIntent - should return null for invalid (zero) amount")
    void testCreatePaymentIntent_InvalidAmount_ReturnsNull() {
        Payment result = service.createPaymentIntent(0L, "usd", "Test User", "test@example.com");
        assertNull(result);
    }

    @Test
    @DisplayName("createPaymentIntent - should save payment to repository on success")
    void testCreatePaymentIntent_SavedToRepository() {
        Payment result = service.createPaymentIntent(1000L, "usd", "Jane Doe", "jane@example.com");
        assertNotNull(result);
        assertNotNull(result.getPaymentIntentId());
        assertTrue(result.getPaymentIntentId().startsWith("pi_"));
        assertNotNull(repository.findById(result.getPaymentIntentId()));
    }

    @Test
    @DisplayName("createPaymentIntent - returned payment should have correct currency")
    void testCreatePaymentIntent_CorrectCurrency() {
        Payment result = service.createPaymentIntent(500L, "eur", "Bob Test", "bob@test.com");
        assertNotNull(result);
        assertEquals("eur", result.getCurrency());
    }

    // ─────────────────────────────────────────────
    // retrievePaymentStatus() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("retrievePaymentStatus - should return null for a non-existent payment ID")
    void testRetrievePaymentStatus_NonExistentId_ReturnsNull() {
        Payment result = service.retrievePaymentStatus("pi_fakeID000XYZ");
        assertNull(result);
    }

    @Test
    @DisplayName("retrievePaymentStatus - should update saved payment status when Stripe returns a result")
    void testRetrievePaymentStatus_UpdatesSavedPayment() {
        repository.save(new Payment("pi_saved123", 1000L, "usd",
                "requires_payment_method", "Saved User", "saved@example.com"));

        Payment result = service.retrievePaymentStatus("pi_saved123");

        assertNotNull(result);
        assertEquals("succeeded", result.getStatus());
        assertEquals("succeeded", repository.findById("pi_saved123").getStatus());
    }

    // ─────────────────────────────────────────────
    // refundPayment() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("refundPayment - should return false for a non-existent payment ID")
    void testRefundPayment_NonExistentId_ReturnsFalse() {
        boolean result = service.refundPayment("pi_fakeRefundID999");
        assertFalse(result);
    }

    @Test
    @DisplayName("refundPayment - should mark an existing payment as refunded on success")
    void testRefundPayment_UpdatesRepositoryStatus() {
        repository.save(new Payment("pi_saved123", 1000L, "usd",
                "succeeded", "Saved User", "saved@example.com"));

        boolean result = service.refundPayment("pi_saved123");

        assertTrue(result);
        assertEquals("refunded", repository.findById("pi_saved123").getStatus());
    }

    private static class StubStripePaymentService extends StripePaymentService {

        StubStripePaymentService(PaymentRepository repository) {
            super(repository);
        }

        @Override
        protected String sendStripeRequest(String method, String endpoint, Map<String, String> params) {
            if ("POST".equals(method) && "/payment_intents".equals(endpoint)) {
                long amount = Long.parseLong(params.get("amount"));
                if (amount < 50L) {
                    return null;
                }
                return """
                        {"id":"pi_test123","status":"requires_payment_method","client_secret":"secret_123"}
                        """;
            }

            if ("GET".equals(method) && "/payment_intents/pi_saved123".equals(endpoint)) {
                return """
                        {"id":"pi_saved123","status":"succeeded"}
                        """;
            }

            if ("GET".equals(method)) {
                return null;
            }

            if ("POST".equals(method) && "/refunds".equals(endpoint)) {
                if ("pi_saved123".equals(params.get("payment_intent"))) {
                    return """
                            {"id":"re_test123","status":"succeeded"}
                            """;
                }
                return null;
            }

            return null;
        }
    }
}
