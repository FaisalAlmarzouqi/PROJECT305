package presentation;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SearchControllerTest {

    @Test
    void testMainWithExistingProduct() {
        String input = "iPhone\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        SearchController.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Enter product name to search:"));
        assertTrue(output.contains("Search Results:"));
        assertTrue(output.contains("iPhone 15"));
    }

    @Test
    void testMainWithNonExistingProduct() {
        String input = "Tablet\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        SearchController.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("No products found."));
    }
}