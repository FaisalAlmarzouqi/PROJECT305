package data;

import model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles product storage
 */
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {

        products.add(new Product(1, "iPhone 15", 999));
        products.add(new Product(2, "Samsung Galaxy", 850));
        products.add(new Product(3, "Lenovo Laptop", 1200));
        products.add(new Product(4, "Nike Shoes", 150));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}