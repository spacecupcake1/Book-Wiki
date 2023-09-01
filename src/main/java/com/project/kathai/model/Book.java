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
    private int book_Id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Authors")
    private String authors;

    @Column(name= "Page_Count")
    private String pages;

    @Column(name = "My_Rating")
    private String rating;

    // Constructors, getters, and setters for Title and Authors

     public Book() {
        // Default constructor with no arguments
    }
   
    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(Integer id) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String page_count) {
        this.pages = page_count;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String my_Rating) {
        this.rating = my_Rating;
    }

    

    
}
