package org.experis.library;

public class Book {

    //attributi

    private String title;
    private int pageNumber;
    private String author;
    private String publisher;

    // setter


    public void setTitle(String title) throws IllegalArgumentException {
        if (title ==null || title.isEmpty()) {
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
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("author can't be empty string");
        }
        this.author = author;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException {
        if (publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("publisher can't be void string");
        }
        this.publisher = publisher;
    }

    // getter


    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    // constructor
    public Book(String title, int pageNumber, String author, String publisher) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("title can't be a void string");
        } else if (pageNumber <= 0) {
            throw new IllegalArgumentException("page number must be higher than 0");
        } else if (author.isEmpty()) {
            throw new IllegalArgumentException("author can't be empty string");
        } else if (publisher.isEmpty()) {
            throw new IllegalArgumentException("publisher can't be void string");
        }

        this.title = title;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
    }

    // metodi


    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", pageNumber=" + pageNumber + ", author='" + author + '\'' + ", publisher='" + publisher + '\'' + '}';
    }


    // validatore con metodo

    private void validateStringNotEmpty(String value, String field) throws IllegalArgumentException {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(field + "null or empty");
        }
    }
}
