package data;

import model.entities.Admin;
import model.entities.User;

import java.util.ArrayList;

public class UserData {


    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();

        users.add(new Admin("admin", "admin@gmail.com", "username", "password"));

        return users;
    }
}
