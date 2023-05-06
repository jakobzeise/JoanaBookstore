package model.entities;

public class Author extends Person {

    private String biography;

    public Author() {
    }

    public Author(String name, String emailAddress, String biography) {
        super(name, emailAddress);
        this.biography = biography;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
