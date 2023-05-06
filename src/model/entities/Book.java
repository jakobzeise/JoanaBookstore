package model.entities;

import java.time.LocalDate;

public class Book {

    private String title;
    private int pages;
    private Author author;
    private Publisher publisher;
    private double price;
    private LocalDate publishingYear;
    private String category;
    public Book(String title, int pages, Author author, Publisher publisher, double price, LocalDate publishingYear, String category) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.publishingYear = publishingYear;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
