package presentation;

import business.SearchService;
import model.Product;

import java.util.List;
import java.util.Scanner;

/**
 * Handles user interaction for searching products
 */
public class SearchController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SearchService service = new SearchService();

        System.out.println("Enter product name to search:");
        String keyword = scanner.nextLine().trim();

        if (keyword.isEmpty()) {
            System.out.println("Search keyword cannot be empty.");
            scanner.close();
            return;
        }

        List<Product> results = service.searchProducts(keyword);

        if (results.isEmpty()) {
            System.out.println("No products found.");
        } else {

            System.out.println("Search Results:");

            for (Product product : results) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }

        scanner.close();
    }
}