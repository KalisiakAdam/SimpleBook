package com.winwinteam.guruspring.springWebApp.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;

    @OneToOne(mappedBy = "publishers")
    private Set<Book> books = new HashSet<>();

    public Publisher(){

    }

    public Publisher(String publisherName, Set<Book> books) {
        this.publisherName = publisherName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
