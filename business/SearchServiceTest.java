package business;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SearchServiceTest {

    @Test
    void testSearchProductsShouldReturnMatchingProducts() {
        SearchService service = new SearchService();

        List<Product> results = service.searchProducts("iphone");

        assertNotNull(results);
        assertFalse(results.isEmpty());
        assertEquals("iPhone 15", results.get(0).getName());
    }

    @Test
    void testSearchProductsShouldBeCaseInsensitive() {
        SearchService service = new SearchService();

        List<Product> results = service.searchProducts("SAMSUNG");

        assertNotNull(results);
        assertFalse(results.isEmpty());
        assertEquals("Samsung Galaxy", results.get(0).getName());
    }

    @Test
    void testSearchProductsShouldReturnEmptyListWhenNoMatch() {
        SearchService service = new SearchService();

        List<Product> results = service.searchProducts("camera");

        assertNotNull(results);
        assertTrue(results.isEmpty());
    }
}