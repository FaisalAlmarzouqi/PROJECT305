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
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(user.getUsername())) {
                users.set(i, user);
                return true;
            }
        }
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
        // User deletedUser = null;
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                // deletedUser = user;
                users.remove(user);
                break;
            }
        }

        // return deletedUser;
    }
}
