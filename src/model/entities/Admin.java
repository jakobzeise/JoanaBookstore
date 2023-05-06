package model.entities;

import model.interfaces.ILogin;

public class Admin extends Person implements ILogin {
    private int id;

    public Admin() {
    }

    public Admin(String firstName, String lastName, String emailAddress, int id) {
        super(firstName, lastName, emailAddress);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
