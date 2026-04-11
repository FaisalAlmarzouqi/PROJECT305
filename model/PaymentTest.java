package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 Test Class for Payment
 * Tests constructors, getters, setters, and toString().
 */
@DisplayName("Payment Entity Tests")
public class PaymentTest {

    private Payment payment;

    @BeforeEach
    void setUp() {
        payment = new Payment("pi_testABC123", 1500L, "usd",
                "requires_payment_method", "Alice Smith", "alice@example.com");
    }

    // ─────────────────────────────────────────────
    // Constructor Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("Full constructor - should correctly assign paymentIntentId")
    void testConstructor_PaymentIntentId() {
        assertEquals("pi_testABC123", payment.getPaymentIntentId());
    }

    @Test
    @DisplayName("Full constructor - should correctly assign amount")
    void testConstructor_Amount() {
        assertEquals(1500L, payment.getAmount());
    }

    @Test
    @DisplayName("Full constructor - should correctly assign currency")
    void testConstructor_Currency() {
        assertEquals("usd", payment.getCurrency());
    }

    @Test
    @DisplayName("Full constructor - should correctly assign status")
    void testConstructor_Status() {
        assertEquals("requires_payment_method", payment.getStatus());
    }

    @Test
    @DisplayName("Full constructor - should correctly assign customerName")
    void testConstructor_CustomerName() {
        assertEquals("Alice Smith", payment.getCustomerName());
    }

    @Test
    @DisplayName("Full constructor - should correctly assign customerEmail")
    void testConstructor_CustomerEmail() {
        assertEquals("alice@example.com", payment.getCustomerEmail());
    }

    @Test
    @DisplayName("Full constructor - createdAt should be a positive timestamp")
    void testConstructor_CreatedAtIsPositive() {
        assertTrue(payment.getCreatedAt() > 0);
    }

    @Test
    @DisplayName("Default constructor - should create a Payment object without errors")
    void testDefaultConstructor() {
        Payment p = new Payment();
        assertNotNull(p);
    }

    // ─────────────────────────────────────────────
    // Setter Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("setPaymentIntentId - should update the payment intent ID")
    void testSetPaymentIntentId() {
        payment.setPaymentIntentId("pi_newID999");
        assertEquals("pi_newID999", payment.getPaymentIntentId());
    }

    @Test
    @DisplayName("setAmount - should update the amount")
    void testSetAmount() {
        payment.setAmount(5000L);
        assertEquals(5000L, payment.getAmount());
    }

    @Test
    @DisplayName("setCurrency - should update the currency")
    void testSetCurrency() {
        payment.setCurrency("eur");
        assertEquals("eur", payment.getCurrency());
    }

    @Test
    @DisplayName("setStatus - should update the status")
    void testSetStatus() {
        payment.setStatus("succeeded");
        assertEquals("succeeded", payment.getStatus());
    }

    @Test
    @DisplayName("setCustomerName - should update the customer name")
    void testSetCustomerName() {
        payment.setCustomerName("Bob Jones");
        assertEquals("Bob Jones", payment.getCustomerName());
    }

    @Test
    @DisplayName("setCustomerEmail - should update the customer email")
    void testSetCustomerEmail() {
        payment.setCustomerEmail("bob@example.com");
        assertEquals("bob@example.com", payment.getCustomerEmail());
    }

    // ─────────────────────────────────────────────
    // toString() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("toString - should contain the payment intent ID")
    void testToString_ContainsId() {
        assertTrue(payment.toString().contains("pi_testABC123"));
    }

    @Test
    @DisplayName("toString - should contain the currency in uppercase")
    void testToString_ContainsCurrencyUppercase() {
        assertTrue(payment.toString().contains("USD"));
    }

    @Test
    @DisplayName("toString - should contain the customer name")
    void testToString_ContainsCustomerName() {
        assertTrue(payment.toString().contains("Alice Smith"));
    }

    @Test
    @DisplayName("toString - should contain the formatted amount (15.00)")
    void testToString_ContainsFormattedAmount() {
        assertTrue(payment.toString().contains("15.00"));
    }

    @Test
    @DisplayName("toString - should not return null")
    void testToString_NotNull() {
        assertNotNull(payment.toString());
    }
}
