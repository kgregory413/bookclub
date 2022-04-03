package com.bookclub.model;

import java.util.List;

// Supply the Book class with the following private fields: 
// String isbn, String title, String description, int
// numOfPages, and List<String> authors.

public class Book
{
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private List<String> authors;

    public Book() {}

// Create a default constructor and a constructor accepting five parameters: String
// isbn, String title, String description, int numOfPages, and List<String> authors.
// Assign these values to the class’s private properties.

    public Book(String isbn, String title, String description, int numOfPages, List<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.numOfPages = numOfPages;
        this.authors = authors;
    }

// Create getter/setter methods for each of the private properties.

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

// Override the classes toString method by returning a string with the following format:
// “Book{isbn=<isbnValue>, title=<titleValue>, description=<descriptionValue>,
// numOfPages=<numOfPagesValue>, authors=<authorsValue>}

    @Override
    public String toString() {
        return String.format("Book{isbn=%s, title=%s, description=%s, numOfPages=%s, authors=%s}", isbn, title, description, numOfPages, authors);
    }
}