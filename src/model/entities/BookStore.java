package model.entities;

import data.UserData;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {

    ArrayList<User> users = UserData.getUsers();


    public static void main(String[] args) {

        Inventory inventory = new Inventory();


        System.out.println("Welcome to the Bookstore");

        BookStore bookstore = new BookStore();
        bookstore.showMainMenu();

    }

    public void showMainMenu() {

        System.out.println("You are in the main menu");
        System.out.println();
        System.out.println("What are you?");
        System.out.println("1. Customer");
        System.out.println("2. Admin");

        Scanner scanner = new Scanner(System.in);

        String selection = scanner.next();

        if (selection.equals("1") || selection.equalsIgnoreCase("customer")) {
            showCustomerLoginMenu();
        } else if (selection.equals("2") || selection.equalsIgnoreCase("admin")) {
            showAdminLoginMenu();
        } else {
            System.out.println("You are only allowed to enter 1 and 2");
        }
    }

    public void showCustomerLoginMenu() {

        System.out.println("Do you want to login or create a new account?");
        System.out.println("1. login");
        System.out.println("2. sign up");

        Scanner scanner = new Scanner(System.in);
        String selection = scanner.next();

        if (selection.equals("1") || selection.equals("login")) {

        } else if (selection.equals("2") || selection.equalsIgnoreCase("sign up")) {
            users.add(Customer.createCustomer());
        }

        System.out.println(users);

        for (User user : users) {
            System.out.println(user.getPassword());
        }
    }

    public void showAdminLoginMenu() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in the admin login menu");

        System.out.println("Type in 0 as your username to go to the main menu!");


        System.out.println("What is your username?");
        String username = scanner.next();
        System.out.println("What is your password?");
        String password = scanner.next();
        User user = User.login(username, password, users);

        if (username.equalsIgnoreCase("0")) {
            showMainMenu();
            return;
        }
        if (user == null) {
            System.out.println("User was not found");
            showAdminLoginMenu();
            return;
        }
        if (user instanceof Admin) {
            showAdminMenu((Admin) user);
            return;
        }

        System.out.println("You are trying to login as an administrator");
        System.out.println("Try to login as a customer");
        System.out.println();
        showCustomerLoginMenu();


    }

    public void showAdminMenu(Admin admin) {
        System.out.println("Welcome " + admin.getName() + " to the Admin Menu");
        System.out.println("What do you want to do?");
    }


}
