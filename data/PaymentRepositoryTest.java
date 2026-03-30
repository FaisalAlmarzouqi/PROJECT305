package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 Test Class for PaymentRepository
 * Tests save, findById, findAll, and updateStatus operations.
 */
@DisplayName("PaymentRepository Tests")
public class PaymentRepositoryTest {

    private PaymentRepository repository;
    private Payment samplePayment;

    @BeforeEach
    void setUp() {
        // NOTE: Because paymentStore is static in PaymentRepository,
        // we use unique IDs per test to avoid interference between tests.
        repository = new PaymentRepository();
        samplePayment = new Payment("pi_repoTest001", 2000L, "usd",
                "requires_payment_method", "Test User", "test@example.com");
    }

    // ─────────────────────────────────────────────
    // save() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("save - should store a payment that can be retrieved by ID")
    void testSave_PaymentCanBeRetrieved() {
        repository.save(samplePayment);
        Payment found = repository.findById("pi_repoTest001");
        assertNotNull(found);
    }

    @Test
    @DisplayName("save - should overwrite an existing payment with same ID")
    void testSave_OverwritesExistingPayment() {
        repository.save(samplePayment);
        Payment updated = new Payment("pi_repoTest001", 9999L, "eur",
                "succeeded", "Updated User", "updated@example.com");
        repository.save(updated);
        Payment found = repository.findById("pi_repoTest001");
        assertEquals(9999L, found.getAmount());
    }

    // ─────────────────────────────────────────────
    // findById() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("findById - should return the correct payment for a saved ID")
    void testFindById_ReturnsCorrectPayment() {
        repository.save(samplePayment);
        Payment found = repository.findById("pi_repoTest001");
        assertEquals("pi_repoTest001", found.getPaymentIntentId());
        assertEquals("Test User", found.getCustomerName());
    }

    @Test
    @DisplayName("findById - should return null for a non-existent ID")
    void testFindById_ReturnsNullForUnknownId() {
        Payment found = repository.findById("pi_doesNotExist");
        assertNull(found);
    }

    // ─────────────────────────────────────────────
    // findAll() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("findAll - should return a list containing all saved payments")
    void testFindAll_ContainsSavedPayments() {
        Payment p1 = new Payment("pi_allTest001", 1000L, "usd", "pending", "User One", "one@test.com");
        Payment p2 = new Payment("pi_allTest002", 2000L, "eur", "pending", "User Two", "two@test.com");
        repository.save(p1);
        repository.save(p2);

        List<Payment> all = repository.findAll();
        assertTrue(all.stream().anyMatch(p -> p.getPaymentIntentId().equals("pi_allTest001")));
        assertTrue(all.stream().anyMatch(p -> p.getPaymentIntentId().equals("pi_allTest002")));
    }

    @Test
    @DisplayName("findAll - should return a non-null list")
    void testFindAll_ReturnsNonNullList() {
        assertNotNull(repository.findAll());
    }

    // ─────────────────────────────────────────────
    // updateStatus() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("updateStatus - should return true when updating an existing payment")
    void testUpdateStatus_ReturnsTrueForExistingId() {
        repository.save(samplePayment);
        boolean result = repository.updateStatus("pi_repoTest001", "succeeded");
        assertTrue(result);
    }

    @Test
    @DisplayName("updateStatus - should correctly change the status of the payment")
    void testUpdateStatus_ChangesStatusCorrectly() {
        repository.save(samplePayment);
        repository.updateStatus("pi_repoTest001", "succeeded");
        Payment found = repository.findById("pi_repoTest001");
        assertEquals("succeeded", found.getStatus());
    }

    @Test
    @DisplayName("updateStatus - should return false for a non-existent payment ID")
    void testUpdateStatus_ReturnsFalseForUnknownId() {
        boolean result = repository.updateStatus("pi_ghost999", "refunded");
        assertFalse(result);
    }

    @Test
    @DisplayName("updateStatus - should correctly set status to 'refunded'")
    void testUpdateStatus_SetToRefunded() {
        repository.save(samplePayment);
        repository.updateStatus("pi_repoTest001", "refunded");
        assertEquals("refunded", repository.findById("pi_repoTest001").getStatus());
    }
}
