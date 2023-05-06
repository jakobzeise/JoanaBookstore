package data;

import model.entities.Author;

import java.util.ArrayList;

public class AuthorData {


    public ArrayList<Author> getAuthors() {

        ArrayList<Author> authorList = new ArrayList<>();


        authorList.add(new Author(
                "J.K.",
                "Rowling",
                "jkrowling@gmail.com",
                """
                        J.K. Rowling is a British author, philanthropist, film producer,
                        television producer, and screenwriter."""
        ));

        authorList.add(new Author(
                "Stephen",
                "King",
                "sking@gmail.com",
                """
                Stephen King is an American author of horror, supernatural fiction,
                 suspense, crime, science-fiction, and fantasy novels."""
        ));

        authorList.add(new Author(
                "Agatha",
                "Christie",
                "achristie@gmail.com",
                """
                 Agatha Christie was an English writer known for her 66 detective novels and
                 14 short story collections."""
                ));

        authorList.add(new Author(
                "Toni",
                "Morrison",
                "tmorrison@gmail.com",
                """
                Toni Morrison was an American novelist, essayist, book editor, and college professor.
                She won the Pulitzer Prize and the Nobel Prize in Literature."""
                ));

        authorList.add(new Author(
                "Ernest",
                "Hemingway",
                "ehemingway@gmail.com",
                """
                 Ernest Hemingway was an American novelist, short-story writer, and journalist. 
                 He was part of the 1920s expatriate community in Paris."""
        ));
/*
        Author author1 = new Author("J.K.", "Rowling", "jkrowling@gmail.com", "J.K. Rowling is a British author, philanthropist, film producer, television producer, and screenwriter.");
        Author author2 = new Author("Stephen", "King", "sking@gmail.com", "Stephen King is an American author of horror, supernatural fiction, suspense, crime, science-fiction, and fantasy novels.");
        Author author3 = new Author("Agatha", "Christie", "achristie@gmail.com", "Agatha Christie was an English writer known for her 66 detective novels and 14 short story collections.");
        Author author4 = new Author("Toni", "Morrison", "tmorrison@gmail.com", "Toni Morrison was an American novelist, essayist, book editor, and college professor. She won the Pulitzer Prize and the Nobel Prize in Literature.");
        Author author5 = new Author("Ernest", "Hemingway", "ehemingway@gmail.com", "Ernest Hemingway was an American novelist, short-story writer, and journalist. He was part of the 1920s expatriate community in Paris.");

        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);
        authorList.add(author4);
        authorList.add(author5);
*/
        return authorList;
    }
}
