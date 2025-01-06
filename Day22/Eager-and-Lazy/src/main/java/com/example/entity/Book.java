package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    // Lazy fetching for Author, so Author will be loaded only when accessed
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

