package com.project.kathai.repository;

import com.project.kathai.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

	//List<Book> findByTitle(String title);

}

