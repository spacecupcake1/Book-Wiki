package com.project.kathai;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.kathai.model.Book;
import com.project.kathai.repository.BookRepository;

@Controller
public class MainController {

    private final Logger LOG = LoggerFactory.getLogger(MainController.class); 

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String index(Model model) {
        LOG.info("Executing index method.");
    
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);

        for(Book book : books){
            System.out.println(book);
        }
        
    
        return "main"; // This should be the name of your Thymeleaf template
    }
    
}
