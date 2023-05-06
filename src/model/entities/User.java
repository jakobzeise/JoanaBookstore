package model.entities;

import model.interfaces.ILoginable;

import java.util.ArrayList;

public class User extends Person implements ILoginable {
    private String username;
    private String password;

    public User(String name, String emailAddress, String username, String password) {
        super(name, emailAddress);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean changeUserName(String username, String newUserName) {
        return false;
    }

    @Override
    public boolean changePassword(String oldPasswort, String newPassword) {
        return false;
    }

    @Override
    public void deleteAccount() {

    }

    public static User login(String username, String password, ArrayList<User> users) {
        for (User user : users) {
            if (user.getName().equals(username)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }

}
