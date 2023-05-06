package model.entities;

public class Publisher extends Person{
        private Address address;
        private String phone;

        public Publisher() {}

        public Publisher(String firstName, String lastName, String email) {}

        public Publisher(String name, String lastName, String email, Address address, String phone) {
            super(name,email);
            this.address = address;
            this.phone = phone;
        }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
