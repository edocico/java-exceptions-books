package org.experis.library;

public class Book {

    //attributi

    private String title;
    private int pageNumber;
    private String author;
    private String publisher;

    // setter


    public void setTitle(String title) throws IllegalArgumentException {
        if (title.equals(" ")) {
            throw new IllegalArgumentException("title can't be empty string");
        }
        this.title = title;
    }

    public void setPageNumber(int pageNumber) throws IllegalArgumentException {
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("page number must be > than 0");
        }
        this.pageNumber = pageNumber;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author.equals(" ")) {
            throw new IllegalArgumentException("author can't be empty string");
        }
        this.author = author;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException {
        if (publisher.equals(" ")) {
            throw new IllegalArgumentException("publisher can't be void string");
        }
        this.publisher = publisher;
    }

    // constructor
    public Book(String title, int pageNumber, String author, String publisher) {
        if (title.equals(" ")) {
            throw new IllegalArgumentException("title can't be a void string");
        } else if (pageNumber <= 0) {
            throw new IllegalArgumentException("page number must be higher than 0");
        } else if (author.equals(" ")) {
            throw new IllegalArgumentException("author can't be empty string");
        } else if (publisher.equals(" ")) {
            throw new IllegalArgumentException("publisher can't be void string");
        }

        this.title = title;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
    }
}