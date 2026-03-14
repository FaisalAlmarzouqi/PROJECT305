package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Payment;

/**
 * Data Layer: PaymentRepository
 * Handles in-memory storage and retrieval of Payment records.
 */
public class PaymentRepository {

    /** In-memory store: Payment Intent ID → Payment object */
    private static final Map<String, Payment> paymentStore = new HashMap<>();

    /**
     * Saves a payment record to the store.
     * @param payment The Payment object to save
     */
    public void save(Payment payment) {
        paymentStore.put(payment.getPaymentIntentId(), payment);
        System.out.println("[DB] Payment saved: " + payment.getPaymentIntentId());
    }

    /**
     * Finds a payment by its ID.
     * @param paymentIntentId The ID to search for
     * @return Payment object or null
     */
    public Payment findById(String paymentIntentId) {
        return paymentStore.get(paymentIntentId);
    }

    /**
     * Returns all stored payments.
     * @return List of all payments
     */
    public List<Payment> findAll() {
        return new ArrayList<>(paymentStore.values());
    }

    /**
     * Updates the status of a payment.
     * @param paymentIntentId The ID to update
     * @param newStatus The new status string
     * @return true if updated, false if not found
     */
    public boolean updateStatus(String paymentIntentId, String newStatus) {
        Payment payment = paymentStore.get(paymentIntentId);
        if (payment != null) {
            payment.setStatus(newStatus);
            return true;
        }
        return false;
    }
}