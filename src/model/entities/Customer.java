package model.entities;

import model.interfaces.ILogin;

public class Customer extends Person implements ILogin {

    private Address address;


    public Customer(String firstName, String lastName, String emailAddress, Address address) {
        super(firstName, lastName, emailAddress);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
