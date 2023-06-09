package com.project.kathai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainController implements CommandLineRunner {

    private final Logger LOG = LoggerFactory.getLogger(MainController.class);

    // Inject the necessary dependencies if required

    @Override
    public void run(String... args) throws Exception {
        // Establish database connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kathai", "rigani", "Modao");

            // Execute query
            String query = "SELECT * FROM mytable";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from each row
            	int id = resultSet.getInt("Book_Id");
                String name = resultSet.getString("Title");
                // ...

                // Do something with the retrieved data (e.g., generate HTML)
                LOG.info("ID: {}, Name: {}", id, name);
                // ...
            }
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
