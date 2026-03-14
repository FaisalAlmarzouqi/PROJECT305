package business;

import model.User;
import data.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(String username, String password) {
        if (!isValidUsername(username) || !isValidPassword(password)) {
            return null;
        }

        // Check if username already exists
        if (userRepository.findByUsername(username) != null) {
            System.out.println("Error: Username already exists!");
            return null;
        }

        // Create and save new user
        User newUser = new User(username, password);
        userRepository.create(newUser);
        System.out.println("User registered successfully!");
        return newUser;
    }

    // Validate username (3-20 characters, alphanumeric and underscores only)
    private boolean isValidUsername(String username) {
        if (username == null || username.length() < 3 || username.length() > 20) {
            System.out.println("Error: Username must be between 3 and 20 characters!");
            return false;
        }
        if (!username.matches("^[a-zA-Z0-9_]+$")) {
            System.out.println("Error: Username can only contain letters, numbers, and underscores!");
            return false;
        }
        return true;
    }

    // Validate password (at least 6 characters)
    private boolean isValidPassword(String password) {
        if (password == null || password.length() < 6) {
            System.out.println("Password is short.");
            return false;
        }
        return true;
    }

    // Login user
    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return true;
        }
        System.out.println("Error: Invalid username or password!");
        return false;
    }

    // Get user by username
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    // Update user
    public boolean updateUser(User user) {
        return userRepository.update(user);
    }

    // Delete user
    public void deleteUser(String username) {
        userRepository.delete(username);
    }

}
