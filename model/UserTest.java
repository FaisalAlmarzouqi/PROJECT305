package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    // --- Default Constructor -----

    @Test
    void defaultConstructor_setsDefaultUsername() {
        User user = new User();

        assertEquals("user", user.getUsername());
    }

    @Test
    void defaultConstructor_setsNullPassword() {
        User user = new User();

        assertNull(user.getPassword());
    }

    // --- Parameterized Constructor ---

    @Test
    void parameterizedConstructor_setsUsername() {
        User user = new User("john_doe", "pass123");

        assertEquals("john_doe", user.getUsername());
    }

    @Test
    void parameterizedConstructor_setsPassword() {
        User user = new User("john_doe", "pass123");

        assertEquals("pass123", user.getPassword());
    }

    @Test
    void parameterizedConstructor_nullUsername_storesNull() {
        User user = new User(null, "pass123");

        assertNull(user.getUsername());
    }

    @Test
    void parameterizedConstructor_nullPassword_storesNull() {
        User user = new User("john_doe", null);

        assertNull(user.getPassword());
    }

    // --- setUsername() ---

    @Test
    void setUsername_updatesUsername() {
        User user = new User("john_doe", "pass123");

        user.setUsername("jane_doe");

        assertEquals("jane_doe", user.getUsername());
    }

    @Test
    void setUsername_nullValue_setsNull() {
        User user = new User("john_doe", "pass123");

        user.setUsername(null);

        assertNull(user.getUsername());
    }

    // --- setPassword() ---

    @Test
    void setPassword_updatesPassword() {
        User user = new User("john_doe", "pass123");

        user.setPassword("newpass999");

        assertEquals("newpass999", user.getPassword());
    }

    @Test
    void setPassword_nullValue_setsNull() {
        User user = new User("john_doe", "pass123");

        user.setPassword(null);

        assertNull(user.getPassword());
    }

    // --- getInfo() ---

    @Test
    void getInfo_returnsFormattedString() {
        User user = new User("john_doe", "pass123");

        assertEquals("Username:john_doe password:pass123", user.getInfo());
    }

    @Test
    void getInfo_defaultConstructor_returnsDefaultValues() {
        User user = new User();

        assertEquals("Username:user password:null", user.getInfo());
    }

    @Test
    void getInfo_nullPassword_showsNullLiteral() {
        User user = new User("john_doe", null);

        assertEquals("Username:john_doe password:null", user.getInfo());
    }

    @Test
    void getInfo_afterUpdate_reflectsNewValues() {
        User user = new User("john_doe", "pass123");
        user.setUsername("jane_doe");
        user.setPassword("newpass999");

        assertEquals("Username:jane_doe password:newpass999", user.getInfo());
    }
}