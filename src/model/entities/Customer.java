package model.entities;

import java.util.Scanner;

public class Customer extends User {

    private Address address;

    public Customer(String name, String emailAddress, String username, String password, Address address) {
        super(name, emailAddress, username, password);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static Customer createCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your full name?");
        String name = scanner.next();

        System.out.println("What is your email address?");
        String email = scanner.next();

        System.out.println("What do you want your username to be");
        String username = scanner.next();

        System.out.println("What do you want your password to be");
        String password = scanner.next();

        System.out.println("What is your street name");
        String streetName = scanner.next();

        System.out.println("What is your city name");
        String cityName = scanner.next();

        System.out.println("What is your state name");
        String stateName = scanner.next();

        System.out.println("What is your your zip code");
        String zipCode = scanner.next();

        System.out.println("What is your country name");
        String countryName = scanner.next();

        Address address = new Address(streetName, cityName, stateName, zipCode, countryName);

        return new Customer(name, email, username, password, address);
    }
}
