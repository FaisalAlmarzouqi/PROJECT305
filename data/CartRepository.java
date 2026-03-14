package data;

import model.CartItem;
import java.util.ArrayList;
import java.util.List;

/**
 * CartRepository handles storing and retrieving cart items.
 */
public class CartRepository {

    private List<CartItem> cartItems = new ArrayList<>();

    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}