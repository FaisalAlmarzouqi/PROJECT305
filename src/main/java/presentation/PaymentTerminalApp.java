package presentation;

import business.PaymentValidator;
import business.StripePaymentService;
import model.Payment;
import data.PaymentRepository;

import java.util.List;
import java.util.Scanner;

/**
 * Presentation Layer: PaymentTerminalApp
 * Main entry point — handles all terminal input/output.
 * Calls business layer only, contains no business logic.
 */
public class PaymentTerminalApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static StripePaymentService paymentService;
    private static PaymentValidator validator;

    /**
     * Application entry point.
     * Initializes all layers and starts the menu loop.
     * @param args Command-line arguments (unused)
     */
    public static void main(String[] args) {
        PaymentRepository repository = new PaymentRepository();
        validator      = new PaymentValidator();
        paymentService = new StripePaymentService(repository);

        printBanner();

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> handleCreatePayment();
                case "2" -> handleRetrievePayment();
                case "3" -> handleRefundPayment();
                case "4" -> handleListPayments();
                case "5" -> { System.out.println("\nGoodbye!"); running = false; }
                default  -> System.out.println("\n[!] Invalid option. Enter 1-5.");
            }
        }
        scanner.close();
    }

    /**
     * Handles Create Payment flow — collects and validates user input.
     */
    private static void handleCreatePayment() {
        System.out.println("\n--- CREATE PAYMENT ---");

        String name;
        while (true) {
            System.out.print("Customer Name   : ");
            name = scanner.nextLine().trim();
            if (validator.isValidName(name)) break;
            System.out.println("[!] Name must be at least 2 characters.");
        }

        String email;
        while (true) {
            System.out.print("Customer Email  : ");
            email = scanner.nextLine().trim();
            if (validator.isValidEmail(email)) break;
            System.out.println("[!] Invalid email format.");
        }

        String currency;
        while (true) {
            System.out.print("Currency (" + validator.getSupportedCurrencies() + "): ");
            currency = scanner.nextLine().trim();
            if (validator.isValidCurrency(currency)) break;
            System.out.println("[!] Unsupported currency.");
        }

        long amountInCents;
        while (true) {
            System.out.print("Amount in cents (1000 = 10.00): ");
            try {
                amountInCents = Long.parseLong(scanner.nextLine().trim());
                if (validator.isValidAmount(amountInCents)) break;
                System.out.println("[!] Amount must be between 50 and 99,999,999.");
            } catch (NumberFormatException e) {
                System.out.println("[!] Enter a valid number.");
            }
        }

        System.out.print("\nConfirm payment of " +
                String.format("%.2f", amountInCents / 100.0) + " " +
                currency.toUpperCase() + " for " + name + "? (y/n): ");
        if (!scanner.nextLine().trim().equalsIgnoreCase("y")) {
            System.out.println("[Cancelled]");
            return;
        }

        Payment result = paymentService.createPaymentIntent(amountInCents, currency, name, email);
        if (result != null) printPaymentDetails(result);
        else System.out.println("\n[FAILED] Check your Stripe key.");
    }

    /**
     * Handles Retrieve Payment Status flow.
     */
    private static void handleRetrievePayment() {
        System.out.println("\n--- RETRIEVE PAYMENT ---");
        String id;
        while (true) {
            System.out.print("Payment Intent ID (pi_...): ");
            id = scanner.nextLine().trim();
            if (validator.isValidPaymentIntentId(id)) break;
            System.out.println("[!] ID must start with pi_");
        }
        Payment result = paymentService.retrievePaymentStatus(id);
        if (result != null) printPaymentDetails(result);
        else System.out.println("[FAILED] Payment not found.");
    }

    /**
     * Handles Refund Payment flow.
     */
    private static void handleRefundPayment() {
        System.out.println("\n--- REFUND PAYMENT ---");
        String id;
        while (true) {
            System.out.print("Payment Intent ID to refund: ");
            id = scanner.nextLine().trim();
            if (validator.isValidPaymentIntentId(id)) break;
            System.out.println("[!] ID must start with pi_");
        }
        System.out.print("Are you sure? (y/n): ");
        if (!scanner.nextLine().trim().equalsIgnoreCase("y")) {
            System.out.println("[Cancelled]");
            return;
        }
        boolean ok = paymentService.refundPayment(id);
        System.out.println(ok ? "[SUCCESS] Refund processed." : "[FAILED] Refund failed.");
    }

    /**
     * Displays all locally stored payment records.
     */
    private static void handleListPayments() {
        System.out.println("\n--- ALL PAYMENTS ---");
        List<Payment> list = paymentService.getAllLocalPayments();
        if (list.isEmpty()) { System.out.println("No payments recorded."); return; }
        for (int i = 0; i < list.size(); i++)
            System.out.println("[" + (i+1) + "] " + list.get(i));
    }

    /**
     * Prints formatted payment details to terminal.
     * @param p Payment object to display
     */
    private static void printPaymentDetails(Payment p) {
        System.out.println("\n  ID      : " + p.getPaymentIntentId());
        System.out.println("  Status  : " + p.getStatus());
        System.out.printf ("  Amount  : %.2f %s%n", p.getAmount()/100.0, p.getCurrency().toUpperCase());
        System.out.println("  Name    : " + p.getCustomerName());
        System.out.println("  Email   : " + p.getCustomerEmail());
    }

    /** Prints welcome banner */
    private static void printBanner() {
        System.out.println("================================");
        System.out.println("   STRIPE PAYMENT SERVICE v1.0  ");
        System.out.println("   Java 3-Layer Architecture    ");
        System.out.println("================================");
    }

    /** Prints main menu options */
    private static void printMenu() {
        System.out.println("\n1. Create Payment Intent");
        System.out.println("2. Retrieve Payment Status");
        System.out.println("3. Refund Payment");
        System.out.println("4. List Local Payments");
        System.out.println("5. Exit");
        System.out.print("Select: ");
    }
}