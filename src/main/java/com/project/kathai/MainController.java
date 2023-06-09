package com.project.kathai;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.springframework.stereotype.Controller;

import com.project.kathai.model.Book;
import com.project.kathai.repository.BookRepository;


@Controller
@Component
public class MainController {

    private final Logger LOG = LoggerFactory.getLogger(MainController.class);
    
    @Autowired
    private SpringTemplateEngine templateEngine;


    @Autowired
    private ViewResolver viewResolver;


    // Inject the necessary dependencies if required

    @Autowired
    private BookRepository bookRepository;

    public void run(String... args) throws Exception {
        // Establish database connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kathai", "rigani", "Modao");

            // Execute query
            String query = "SELECT * FROM mytable";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Process the result set and populate a list of Book objects
            List<Book> books = new ArrayList<>();
            while (resultSet.next()) {
            	int id = resultSet.getInt("Book_Id");
                String title = resultSet.getString("Title");
                String author = resultSet.getString("Authors");

                Book book = new Book(id, title, author);
                books.add(book);
            }

            // Pass the list of books to the Thymeleaf template
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("books", books);
            modelAndView.setViewName("main"); // Replace with the actual name of your HTML template

            // You can also pass additional data to the template if needed
            // modelAndView.addObject("someData", someData);

            // Render the HTML template
         // Render the HTML template
            Context context = new Context();
            context.setVariable("books", books); // Pass the list of books to the template

            String htmlOutput = templateEngine.process("main", context);


            // Save the HTML output to a file or send it as a response to the client
            // ...
            
            File htmlFile = new File("../../../../output.html");
            FileWriter fileWriter = new FileWriter(htmlFile);
            fileWriter.write(htmlOutput);
            fileWriter.close();

        } catch (SQLException e) {
            LOG.error("Error executing SQL query: {}", e.getMessage());
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    LOG.error("Error closing database connection: {}", e.getMessage());
                }
            }
        }
    }
}
