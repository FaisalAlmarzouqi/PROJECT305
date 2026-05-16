package data;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    // users array (Database)
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    // *** CRUD operations ***
    // Create a user
    public void create(User user) {
        users.add(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    // Get user by username
    public User getByUsername(String username) {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                result = user;
                break;
            }
        }

        return result;
    }

    // Update user
    public boolean update(User user) {
        // Check if user is null
        if (user == null) {
            System.out.println("ipdate failed: User cannot be null.");
            return false;
        }

        // Check if username is null or empty
        if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
            System.out.println("update failed: username cannot be null or empty.");
            return false;
        }

        // Check if password is null or empty
        if (user.getPassword() == null || user.getPassword().trim().isEmpty()) {
            System.out.println("update failed: password cannot be null or empty.");
            return false;
        }

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(user.getUsername())) {
                users.set(i, user);
                return true;
            }
        }

        System.out.println("update failed: user '" + user.getUsername() + "' not found.");
        return false;
    }

    // Find user by username
    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    // Delete user by username
    public void delete(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                users.remove(user);
                break;
            }
        }
    }
}
