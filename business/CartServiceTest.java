package business;

import data.CartRepository;
import model.CartItem;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    @Test
    void testAddToCart() {
        CartRepository repo = new CartRepository();
        CartService service = new CartService(repo);

        service.addToCart(1, "Laptop", 1, 500.0);

        List<CartItem> items = service.viewCart();

        assertEquals(1, items.size());
        assertEquals("Laptop", items.get(0).getProductName());
    }

    @Test
    void testViewCartMultipleItems() {
        CartRepository repo = new CartRepository();
        CartService service = new CartService(repo);

        service.addToCart(1, "Laptop", 1, 500.0);
        service.addToCart(2, "Mouse", 2, 10.0);

        List<CartItem> items = service.viewCart();

        assertEquals(2, items.size());
    }
}