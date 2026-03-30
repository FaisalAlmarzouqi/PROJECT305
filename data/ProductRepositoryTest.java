package data;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {

    @Test
    void testGetAllProductsShouldNotBeEmpty() {
        ProductRepository repository = new ProductRepository();

        List<Product> products = repository.getAllProducts();

        assertNotNull(products);
        assertFalse(products.isEmpty());
    }

    @Test
    void testGetAllProductsShouldContainFourProducts() {
        ProductRepository repository = new ProductRepository();

        List<Product> products = repository.getAllProducts();

        assertEquals(4, products.size());
    }

    @Test
    void testGetAllProductsContainsExpectedNames() {
        ProductRepository repository = new ProductRepository();

        List<Product> products = repository.getAllProducts();

        assertEquals("iPhone 15", products.get(0).getName());
        assertEquals("Samsung Galaxy", products.get(1).getName());
        assertEquals("Lenovo Laptop", products.get(2).getName());
        assertEquals("Nike Shoes", products.get(3).getName());
    }
}