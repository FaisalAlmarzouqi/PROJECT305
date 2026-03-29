package data;

import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    private UserRepository userRepository;
    private User user1;
    private User user2;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        user1 = new User("john_doe", "pass123");
        user2 = new User("jane_doe", "pass456");
    }

    // --- create() ---

    @Test
    void create_addsUserToRepository() {
        userRepository.create(user1);

        assertNotNull(userRepository.findByUsername("john_doe"));
    }

    @Test
    void create_multipleUsers_allAdded() {
        userRepository.create(user1);
        userRepository.create(user2);

        assertNotNull(userRepository.findByUsername("john_doe"));
        assertNotNull(userRepository.findByUsername("jane_doe"));
    }

    // --- getAllUsers() ---

    @Test
    void getAllUsers_emptyRepository_returnsEmptyList() {
        List<User> result = userRepository.getAllUsers();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void getAllUsers_returnsAllUsers() {
        userRepository.create(user1);
        userRepository.create(user2);

        List<User> result = userRepository.getAllUsers();

        assertEquals(2, result.size());
        assertTrue(result.contains(user1));
        assertTrue(result.contains(user2));
    }

    @Test
    void getAllUsers_returnsDefensiveCopy() {
        userRepository.create(user1);

        List<User> result = userRepository.getAllUsers();
        result.clear();

        assertEquals(1, userRepository.getAllUsers().size());
    }

    // --- getByUsername() ---

    @Test
    void getByUsername_existingUser_returnsUser() {
        userRepository.create(user1);

        User result = userRepository.getByUsername("john_doe");

        assertNotNull(result);
        assertEquals("john_doe", result.getUsername());
    }

    @Test
    void getByUsername_nonExistingUser_returnsNull() {
        User result = userRepository.getByUsername("ghost");

        assertNull(result);
    }

    @Test
    void getByUsername_emptyRepository_returnsNull() {
        assertNull(userRepository.getByUsername("john_doe"));
    }

    // --- findByUsername() ---

    @Test
    void findByUsername_existingUser_returnsUser() {
        userRepository.create(user1);

        User result = userRepository.findByUsername("john_doe");

        assertNotNull(result);
        assertEquals("john_doe", result.getUsername());
    }

    @Test
    void findByUsername_nonExistingUser_returnsNull() {
        assertNull(userRepository.findByUsername("nobody"));
    }

    @Test
    void findByUsername_multipleUsers_returnsCorrectUser() {
        userRepository.create(user1);
        userRepository.create(user2);

        User result = userRepository.findByUsername("jane_doe");

        assertNotNull(result);
        assertEquals("jane_doe", result.getUsername());
    }

    // --- update() ---

    @Test
    void update_existingUser_returnsTrue() {
        userRepository.create(user1);
        User updated = new User("john_doe", "newpass999");

        boolean result = userRepository.update(updated);

        assertTrue(result);
    }

    @Test
    void update_existingUser_updatesData() {
        userRepository.create(user1);
        User updated = new User("john_doe", "newpass999");

        userRepository.update(updated);

        assertEquals("newpass999", userRepository.findByUsername("john_doe").getPassword());
    }

    @Test
    void update_nonExistingUser_returnsFalse() {
        User ghost = new User("ghost", "pass000");

        boolean result = userRepository.update(ghost);

        assertFalse(result);
    }

    @Test
    void update_doesNotChangeTotalUserCount() {
        userRepository.create(user1);
        userRepository.create(user2);
        User updated = new User("john_doe", "newpass999");

        userRepository.update(updated);

        assertEquals(2, userRepository.getAllUsers().size());
    }

    // --- delete() ---

    @Test
    void delete_existingUser_removesUser() {
        userRepository.create(user1);

        userRepository.delete("john_doe");

        assertNull(userRepository.findByUsername("john_doe"));
    }

    @Test
    void delete_existingUser_reducesCount() {
        userRepository.create(user1);
        userRepository.create(user2);

        userRepository.delete("john_doe");

        assertEquals(1, userRepository.getAllUsers().size());
    }

    @Test
    void delete_nonExistingUser_doesNotThrow() {
        userRepository.create(user1);

        assertDoesNotThrow(() -> userRepository.delete("ghost"));
        assertEquals(1, userRepository.getAllUsers().size());
    }

    @Test
    void delete_onlyRemovesTargetUser() {
        userRepository.create(user1);
        userRepository.create(user2);

        userRepository.delete("john_doe");

        assertNull(userRepository.findByUsername("john_doe"));
        assertNotNull(userRepository.findByUsername("jane_doe"));
    }

    @Test
    void delete_emptyRepository_doesNotThrow() {
        assertDoesNotThrow(() -> userRepository.delete("john_doe"));
    }
}