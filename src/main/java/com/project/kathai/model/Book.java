package com.project.kathai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mytable")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Book_Id")
    private int Book_Id;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Authors")
    private String Authors;

    // Constructors, getters, and setters for Title and Authors

    public int getBook_Id() {
        return Book_Id;
    }
    
    public Book() {
        // Default constructor with no arguments
    }

    public Book(int book_Id, String title, String authors) {
        Book_Id = book_Id;
        Title = title;
        Authors = authors;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String authors) {
        Authors = authors;
    }

    public void setBook_Id(Integer id) {
    }

    
}
