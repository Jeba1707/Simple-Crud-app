package com.example.myrokomari.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
    @Id
    private long id ;
    private String title;
    private String author;
    private String edition;
    private int numberOfPages;
    private String country;
    private String language;


}
