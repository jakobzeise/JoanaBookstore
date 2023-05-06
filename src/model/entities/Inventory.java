package model.entities;

import data.BooksData;

import java.util.ArrayList;


public class Inventory {

    private ArrayList<Book> books = BooksData.getBooks();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
//    public long getCountOfBooks(String title) {
//        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).count();
//    }


    // link to a video about functional programming https://youtu.be/VRpHdSFWGPs

    // imperative declarative programming
    public long getCountOfBook(String nameOfTheBook) {
        int count = 0;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(nameOfTheBook)) {
                count++;
            }
        }
        return count;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}