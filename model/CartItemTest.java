package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartItemTest {

    @Test
    void testCartItemCreation() {
        CartItem item = new CartItem(1, "Laptop", 2, 500.0);

        assertEquals(1, item.getProductId());
        assertEquals("Laptop", item.getProductName());
        assertEquals(2, item.getQuantity());
        assertEquals(500.0, item.getPrice());
    }

    @Test
    void testSetQuantity() {
        CartItem item = new CartItem(1, "Laptop", 1, 500.0);

        item.setQuantity(5);

        assertEquals(5, item.getQuantity());
    }
}