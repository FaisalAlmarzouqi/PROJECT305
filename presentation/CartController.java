package presentation;

import business.CartService;
import data.CartRepository;
import model.CartItem;

/**
 * CartController simulates the user interacting with the cart.
 */
public class CartController {

    public static void main(String[] args) {

        CartRepository repo = new CartRepository();
        CartService service = new CartService(repo);

        // Simulate adding products to cart
        service.addToCart(1, "Laptop", 1, 500);
        service.addToCart(2, "Mouse", 2, 10);
        service.addToCart(3, "Keyboard", 1, 30);

        System.out.println("Items in Cart:");

        for (CartItem item : service.viewCart()) {
            System.out.println(
                item.getProductName() +
                " | Quantity: " + item.getQuantity() +
                " | Price: " + item.getPrice()
            );
        }
    }
}

// #1 small edit for github