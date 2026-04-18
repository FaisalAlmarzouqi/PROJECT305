package business;

import model.User;
import data.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService(userRepository);
    }

    // --- register() ---

    @Test
    void register_validCredentials_returnsUser() {
        when(userRepository.findByUsername("john_doe")).thenReturn(null);

        User result = userService.register("john_doe", "secret123");

        assertNotNull(result);
        assertEquals("john_doe", result.getUsername());
        verify(userRepository).create(result);
    }

    @Test
    void register_usernameTooShort_returnsNull() {
        User result = userService.register("ab", "secret123");

        assertNull(result);
        verify(userRepository, never()).create(any());
    }

    @Test
    void register_usernameTooLong_returnsNull() {
        User result = userService.register("this_username_is_way_too_long", "secret123");

        assertNull(result);
        verify(userRepository, never()).create(any());
    }

    @Test
    void register_usernameWithSpecialChars_returnsNull() {
        User result = userService.register("john@doe", "secret123");

        assertNull(result);
        verify(userRepository, never()).create(any());
    }

    @Test
    void register_nullUsername_returnsNull() {
        User result = userService.register(null, "secret123");

        assertNull(result);
        verify(userRepository, never()).create(any());
    }

    @Test
    void register_passwordTooShort_returnsNull() {
        User result = userService.register("john_doe", "abc");

        assertNull(result);
        verify(userRepository, never()).create(any());
    }

    @Test
    void register_nullPassword_returnsNull() {
        User result = userService.register("john_doe", null);

        assertNull(result);
        verify(userRepository, never()).create(any());
    }

    @Test
    void register_duplicateUsername_returnsNull() {
        when(userRepository.findByUsername("john_doe")).thenReturn(new User("john_doe", "pass123"));

        User result = userService.register("john_doe", "newpass123");

        assertNull(result);
        verify(userRepository, never()).create(any());
    }

    // --- login() ---

    @Test
    void login_correctCredentials_returnsTrue() {
        when(userRepository.findByUsername("john_doe")).thenReturn(new User("john_doe", "secret123"));

        assertTrue(userService.login("john_doe", "secret123"));
    }

    @Test
    void login_wrongPassword_returnsFalse() {
        when(userRepository.findByUsername("john_doe")).thenReturn(new User("john_doe", "secret123"));

        assertFalse(userService.login("john_doe", "wrongpass"));
    }

    @Test
    void login_userNotFound_returnsFalse() {
        when(userRepository.findByUsername("unknown")).thenReturn(null);

        assertFalse(userService.login("unknown", "secret123"));
    }

    // --- getUser() ---

    @Test
    void getUser_existingUsername_returnsUser() {
        User expected = new User("john_doe", "secret123");
        when(userRepository.findByUsername("john_doe")).thenReturn(expected);

        assertEquals(expected, userService.getUser("john_doe"));
    }

    @Test
    void getUser_nonExistingUsername_returnsNull() {
        when(userRepository.findByUsername("ghost")).thenReturn(null);

        assertNull(userService.getUser("ghost"));
    }

    // --- updateUser() ---

    @Test
    void updateUser_successfulUpdate_returnsTrue() {
        User user = new User("john_doe", "newpass123");
        when(userRepository.update(user)).thenReturn(true);

        assertTrue(userService.updateUser(user));
    }

    @Test
    void updateUser_failedUpdate_returnsFalse() {
        User user = new User("john_doe", "newpass123");
        when(userRepository.update(user)).thenReturn(false);

        assertFalse(userService.updateUser(user));
    }

    // --- deleteUser() ---

    @Test
    void deleteUser_callsRepositoryDelete() {
        userService.deleteUser("john_doe");

        verify(userRepository).delete("john_doe");
    }
}