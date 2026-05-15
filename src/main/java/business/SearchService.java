package business;

import data.ProductRepository;
import model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles product search logic
 */
public class SearchService {

    private ProductRepository repository = new ProductRepository();

    public List<Product> searchProducts(String keyword) {

        List<Product> results = new ArrayList<>();

        // Prevent empty or null search input
        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        for (Product product : repository.getAllProducts()) {

            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(product);
            }

        }

        return results;
    }
}