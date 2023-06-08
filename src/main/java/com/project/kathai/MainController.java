package com.project.kathai;

import java.io.File;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainController implements CommandLineRunner{

	private final Logger LOG = LoggerFactory.getLogger(MainController.class);
	
	File f = new File("Bookshelf.csv");
	Scanner sc;

	@Override
	public void run(String... args) throws Exception {
	    sc = new Scanner(f);
	    sc.nextLine();
	    while (sc.hasNextLine()) {
	        String line = sc.nextLine();
	        String[] lineItems = line.split(";");

	            String bookId = lineItems[0].replaceAll("\"", "");
	            String isbn = lineItems[1].replaceAll("\"", "");
	            System.out.println("bookId: " + bookId);
	            System.out.println("isbn: " + isbn);
	            
	    }
	}

}
