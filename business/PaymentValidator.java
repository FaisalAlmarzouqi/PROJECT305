package business;

/**

 Validates all user input before sending to Stripe API
 */
public class PaymentValidator {

    private static final long MIN_AMOUNT_CENTS = 50;
    private static final long MAX_AMOUNT_CENTS = 99_999_999L;
    private static final String[] SUPPORTED_CURRENCIES = {"usd", "eur", "gbp", "aed", "bhd", "sar"};

    /**
     * Validates payment amount is within allowed range
     *  amountInCents Amount in smallest currency unit
     * return true if valid
     */
    public boolean isValidAmount(long amountInCents) {
        return amountInCents >= MIN_AMOUNT_CENTS && amountInCents <= MAX_AMOUNT_CENTS;
    }

    /**
     * Validates currency is supported
     * @param currency ISO currency code
     * @return true if supported
     */
    public boolean isValidCurrency(String currency) {
        if (currency == null || currency.isBlank()) return false;
        for (String s : SUPPORTED_CURRENCIES)
            if (s.equalsIgnoreCase(currency)) return true;
        return false;
    }

    /**
     * Validates email format.
     * @param email Email string to validate
     * @return true if valid format
     */
    public boolean isValidEmail(String email) {
        if (email == null || email.isBlank()) return false;
        return email.matches("^[\\w.+\\-]+@[\\w\\-]+\\.[a-zA-Z]{2,}$");
    }

    /**
     * Validates customer name is not empty.
     * @param name Customer name
     * @return true if valid
     */
    public boolean isValidName(String name) {
        return name != null && !name.isBlank() && name.trim().length() >= 2;
    }

    /**
     * Validates Stripe Payment Intent ID format.
     * @param id The ID to validate
     * @return true if starts with pi_
     */
    public boolean isValidPaymentIntentId(String id) {
        return id != null && id.startsWith("pi_") && id.length() > 5;
    }

    /**
     * Returns supported currencies as a string.
     * @return Comma-separated currency codes
     */
    public String getSupportedCurrencies() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SUPPORTED_CURRENCIES.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(SUPPORTED_CURRENCIES[i].toUpperCase());
        }
        return sb.toString();
    }
}
