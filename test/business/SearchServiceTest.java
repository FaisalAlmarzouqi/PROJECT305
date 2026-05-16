package business;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SearchServiceTest {

    @Test
    void testSearchExistingProductFullName() {
        SearchService service = new SearchService();
        List<Product> results = service.searchProducts("iPhone 15");

        assertEquals(1, results.size());
        assertEquals("iPhone 15", results.get(0).getName());
    }

    @Test
    void testSearchExistingProductPartialName() {
        SearchService service = new SearchService();
        List<Product> results = service.searchProducts("Galaxy");

        assertEquals(1, results.size());
        assertEquals("Samsung Galaxy", results.get(0).getName());
    }

    @Test
    void testSearchShouldBeCaseInsensitive() {
        SearchService service = new SearchService();
        List<Product> results = service.searchProducts("iphone");

        assertEquals(1, results.size());
        assertEquals("iPhone 15", results.get(0).getName());
    }

    @Test
    void testSearchNoResults() {
        SearchService service = new SearchService();
        List<Product> results = service.searchProducts("Tablet");

        assertNotNull(results);
        assertTrue(results.isEmpty());
    }
}