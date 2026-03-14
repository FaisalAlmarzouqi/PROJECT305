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
        this.cartRepository = cartRepository;
    }

    public void addToCart(int productId, String name, int quantity, double price) {

        CartItem item = new CartItem(productId, name, quantity, price);

        cartRepository.addItem(item);
    }

    public List<CartItem> viewCart() {
        return cartRepository.getCartItems();
    }
}