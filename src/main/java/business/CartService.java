package business;

import data.CartRepository;
import model.CartItem;
import java.util.List;

/**
 * CartService contains the business logic for cart operations.
 */
public class CartService {

    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {

        if (cartRepository == null) {
            System.out.println("CartRepository cannot be null.");
        }

        this.cartRepository = cartRepository;
    }

    public void addToCart(int productId, String name, int quantity, double price) {

        // Validate product ID
        if (productId <= 0) {
            System.out.println("Invalid product ID.");
            return;
        }

        // Validate product name
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Product name cannot be empty.");
            return;
        }

        // Validate quantity
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0.");
            return;
        }

        // Validate price
        if (price <= 0) {
            System.out.println("Price must be greater than 0.");
            return;
        }

        CartItem item = new CartItem(productId, name, quantity, price);

        cartRepository.addItem(item);

        System.out.println("Item added to cart successfully.");
    }

    public List<CartItem> viewCart() {

        List<CartItem> items = cartRepository.getCartItems();

        if (items.isEmpty()) {
            System.out.println("Cart is currently empty.");
        }

        return items;
    }
}