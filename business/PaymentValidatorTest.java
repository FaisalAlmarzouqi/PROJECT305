package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 Test Class for PaymentValidator
 * Tests all validation methods in the business layer.
 */
@DisplayName("PaymentValidator Tests")
public class PaymentValidatorTest {

    private PaymentValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PaymentValidator();
    }

    // ─────────────────────────────────────────────
    // isValidAmount() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("isValidAmount - should return true for minimum valid amount (50)")
    void testIsValidAmount_MinBoundary() {
        assertTrue(validator.isValidAmount(50));
    }

    @Test
    @DisplayName("isValidAmount - should return true for maximum valid amount (99999999)")
    void testIsValidAmount_MaxBoundary() {
        assertTrue(validator.isValidAmount(99_999_999L));
    }

    @Test
    @DisplayName("isValidAmount - should return true for a typical amount (1000 cents = $10)")
    void testIsValidAmount_TypicalAmount() {
        assertTrue(validator.isValidAmount(1000));
    }

    @Test
    @DisplayName("isValidAmount - should return false for amount below minimum (49)")
    void testIsValidAmount_BelowMinimum() {
        assertFalse(validator.isValidAmount(49));
    }

    @Test
    @DisplayName("isValidAmount - should return false for zero")
    void testIsValidAmount_Zero() {
        assertFalse(validator.isValidAmount(0));
    }

    @Test
    @DisplayName("isValidAmount - should return false for negative amount")
    void testIsValidAmount_Negative() {
        assertFalse(validator.isValidAmount(-100));
    }

    @Test
    @DisplayName("isValidAmount - should return false for amount above maximum")
    void testIsValidAmount_AboveMaximum() {
        assertFalse(validator.isValidAmount(100_000_000L));
    }

    // ─────────────────────────────────────────────
    // isValidCurrency() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("isValidCurrency - should return true for 'usd' (lowercase)")
    void testIsValidCurrency_USD_Lowercase() {
        assertTrue(validator.isValidCurrency("usd"));
    }

    @Test
    @DisplayName("isValidCurrency - should return true for 'USD' (uppercase)")
    void testIsValidCurrency_USD_Uppercase() {
        assertTrue(validator.isValidCurrency("USD"));
    }

    @Test
    @DisplayName("isValidCurrency - should return true for 'BHD'")
    void testIsValidCurrency_BHD() {
        assertTrue(validator.isValidCurrency("BHD"));
    }

    @Test
    @DisplayName("isValidCurrency - should return true for 'AED'")
    void testIsValidCurrency_AED() {
        assertTrue(validator.isValidCurrency("AED"));
    }

    @Test
    @DisplayName("isValidCurrency - should return false for unsupported currency 'JPY'")
    void testIsValidCurrency_Unsupported() {
        assertFalse(validator.isValidCurrency("JPY"));
    }

    @Test
    @DisplayName("isValidCurrency - should return false for null input")
    void testIsValidCurrency_Null() {
        assertFalse(validator.isValidCurrency(null));
    }

    @Test
    @DisplayName("isValidCurrency - should return false for blank string")
    void testIsValidCurrency_Blank() {
        assertFalse(validator.isValidCurrency("   "));
    }

    @Test
    @DisplayName("isValidCurrency - should return false for empty string")
    void testIsValidCurrency_Empty() {
        assertFalse(validator.isValidCurrency(""));
    }

    // ─────────────────────────────────────────────
    // isValidEmail() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("isValidEmail - should return true for a standard valid email")
    void testIsValidEmail_Valid() {
        assertTrue(validator.isValidEmail("student@university.com"));
    }

    @Test
    @DisplayName("isValidEmail - should return true for email with dots and plus")
    void testIsValidEmail_WithDotsAndPlus() {
        assertTrue(validator.isValidEmail("first.last+tag@domain.org"));
    }

    @Test
    @DisplayName("isValidEmail - should return false for email missing '@'")
    void testIsValidEmail_MissingAt() {
        assertFalse(validator.isValidEmail("invalidemail.com"));
    }

    @Test
    @DisplayName("isValidEmail - should return false for email missing domain")
    void testIsValidEmail_MissingDomain() {
        assertFalse(validator.isValidEmail("user@"));
    }

    @Test
    @DisplayName("isValidEmail - should return false for null email")
    void testIsValidEmail_Null() {
        assertFalse(validator.isValidEmail(null));
    }

    @Test
    @DisplayName("isValidEmail - should return false for blank email")
    void testIsValidEmail_Blank() {
        assertFalse(validator.isValidEmail("   "));
    }

    // ─────────────────────────────────────────────
    // isValidName() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("isValidName - should return true for a normal full name")
    void testIsValidName_Valid() {
        assertTrue(validator.isValidName("John Doe"));
    }

    @Test
    @DisplayName("isValidName - should return true for exactly 2 characters")
    void testIsValidName_MinLength() {
        assertTrue(validator.isValidName("Jo"));
    }

    @Test
    @DisplayName("isValidName - should return false for single character name")
    void testIsValidName_TooShort() {
        assertFalse(validator.isValidName("J"));
    }

    @Test
    @DisplayName("isValidName - should return false for null name")
    void testIsValidName_Null() {
        assertFalse(validator.isValidName(null));
    }

    @Test
    @DisplayName("isValidName - should return false for blank name")
    void testIsValidName_Blank() {
        assertFalse(validator.isValidName("   "));
    }

    @Test
    @DisplayName("isValidName - should return false for empty string")
    void testIsValidName_Empty() {
        assertFalse(validator.isValidName(""));
    }

    // ─────────────────────────────────────────────
    // isValidPaymentIntentId() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("isValidPaymentIntentId - should return true for a valid Stripe PI ID")
    void testIsValidPaymentIntentId_Valid() {
        assertTrue(validator.isValidPaymentIntentId("pi_3ABC123XYZ"));
    }

    @Test
    @DisplayName("isValidPaymentIntentId - should return false for ID not starting with pi_")
    void testIsValidPaymentIntentId_WrongPrefix() {
        assertFalse(validator.isValidPaymentIntentId("ch_3ABC123XYZ"));
    }

    @Test
    @DisplayName("isValidPaymentIntentId - should return false for ID that is too short")
    void testIsValidPaymentIntentId_TooShort() {
        assertFalse(validator.isValidPaymentIntentId("pi_x"));
    }

    @Test
    @DisplayName("isValidPaymentIntentId - should return false for null ID")
    void testIsValidPaymentIntentId_Null() {
        assertFalse(validator.isValidPaymentIntentId(null));
    }

    // ─────────────────────────────────────────────
    // getSupportedCurrencies() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("getSupportedCurrencies - should return a non-null, non-empty string")
    void testGetSupportedCurrencies_NotEmpty() {
        String result = validator.getSupportedCurrencies();
        assertNotNull(result);
        assertFalse(result.isBlank());
    }

    @Test
    @DisplayName("getSupportedCurrencies - should contain USD")
    void testGetSupportedCurrencies_ContainsUSD() {
        assertTrue(validator.getSupportedCurrencies().contains("USD"));
    }

    @Test
    @DisplayName("getSupportedCurrencies - should contain BHD")
    void testGetSupportedCurrencies_ContainsBHD() {
        assertTrue(validator.getSupportedCurrencies().contains("BHD"));
    }
}
