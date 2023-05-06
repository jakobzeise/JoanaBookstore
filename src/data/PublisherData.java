package data;

import model.entities.Publisher;

import java.util.ArrayList;

public class PublisherData {

    static ArrayList<Publisher> publishers;

    private static ArrayList<Publisher> getPublishers() {
        ArrayList<Publisher> publishers = new ArrayList<>();

        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));
        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));
        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));
        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));
        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));
        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));
        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));
        publishers.add(new Publisher("Scribner", "Publishing", "scribner@gmail.com"));

        return publishers;
    }

    public Publisher getPublisherByName(String name) {

        // TODO: 5/6/2023 Implemtn this
        return null;
    }
}
