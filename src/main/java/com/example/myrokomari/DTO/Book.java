package com.example.myrokomari.DTO;

public class Book {
    private int id ;
    private String title;
    private String author;
    private String publisher;
    private String edition;
    private int numberOfPages;
    private String country;
    private String language;


    public Book(String title, String author, String publisher, String edition, int numberOfPages, String country, String language) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.numberOfPages = numberOfPages;
        this.country = country;
        this.language = language;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
