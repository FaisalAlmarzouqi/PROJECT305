package model;

public class User {
    private String username;
    private String password;

    public User() {
        username = "user";
        password = null;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String newName) {
        this.username = newName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return "Username:" + this.username + " password:" + this.password;
    }

}