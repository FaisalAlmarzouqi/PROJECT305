package presentation;

import business.UserService;
import data.UserRepository;
import model.User;

public class UserController {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();
        UserService service = new UserService(repo);

        // Example 1: Successful registration
        User newUser = service.register("john_doe", "securePass123");
        if (newUser != null) {
            System.out.println("Welcome, " + newUser.getUsername() + "!");
        }

        // Example 2: Registration with invalid username (too short)
        User invalidUser = service.register("ab", "password123");
        System.out.println("Invalid user: " + invalidUser);

        // Example 3: Registration with existing username
        User existingUser = service.register("mohammed", "anotherPass");
        System.out.println("Existing user: " + existingUser);

        // Example 1: Successful login
        boolean loginSuccess = service.login("mohammed", "123");
        System.out.println("Login success: " + loginSuccess);
        if (loginSuccess) {
            System.out.println("Login succes!");
        }

        // Example 2: Failed login (wrong password)
        boolean loginFail = service.login("mohammed", "123abc");
        System.err.println(loginFail);

        // Example 3: Failed login
        boolean loginFail2 = service.login("ahmed", "password");
        System.out.println(loginFail2);
    }
}
