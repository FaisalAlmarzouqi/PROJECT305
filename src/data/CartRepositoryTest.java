package data;

import model.CartItem;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartRepositoryTest {

    @Test
    void testAddItem() {
        CartRepository repo = new CartRepository();

        CartItem item = new CartItem(1, "Laptop", 1, 500.0);
        repo.addItem(item);

        List<CartItem> items = repo.getCartItems();

        assertEquals(1, items.size());
        assertEquals("Laptop", items.get(0).getProductName());
    }

    @Test
    void testGetCartItemsInitiallyEmpty() {
        CartRepository repo = new CartRepository();

        List<CartItem> items = repo.getCartItems();

        assertTrue(items.isEmpty());
    }
}