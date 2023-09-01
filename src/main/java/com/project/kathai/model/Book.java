package com.project.kathai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Book {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Book_Id;
    private String Title;
    private String Authors;

    public Book(int Book_Id, String Title, String Authors) {
        this.Book_Id = Book_Id;
        this.Title = Title;
        this.Authors = Authors;
    }

    public void setBook_Id(int id) {
		this.Book_Id = id;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public void setAuthors(String author) {
		this.Authors = author;
	}

	public int getBook_Id() {
        return Book_Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthors() {
        return Authors;
    }
}
