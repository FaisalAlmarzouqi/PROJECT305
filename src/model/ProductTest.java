package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testProductCreationShouldSetValuesCorrectly() {
        Product product = new Product(1, "iPhone 15", 999);

        assertEquals(1, product.getId());
        assertEquals("iPhone 15", product.getName());
        assertEquals(999, product.getPrice());
    }

    @Test
    void testDifferentProductValues() {
        Product product = new Product(2, "Samsung Galaxy", 850);

        assertEquals(2, product.getId());
        assertEquals("Samsung Galaxy", product.getName());
        assertEquals(850, product.getPrice());
    }
}