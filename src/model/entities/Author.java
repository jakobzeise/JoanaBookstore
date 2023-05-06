package model.entities;

public class Author extends Person {

    private String biography;

    public Author() {
    }

    public Author(String firstName, String lastName, String emailAddress, String biography) {
        super(firstName, lastName, emailAddress);
        this.biography = biography;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
