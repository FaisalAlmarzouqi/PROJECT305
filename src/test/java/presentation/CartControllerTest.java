package presentation;

import org.junit.jupiter.api.Test;

import presentation.CartController;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CartControllerTest {

    @Test
    void testMainRunsWithoutError() {
        assertDoesNotThrow(() -> {
            CartController.main(new String[]{});
        });
    }
}