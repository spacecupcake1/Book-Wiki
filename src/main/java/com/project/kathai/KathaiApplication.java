package com.project.kathai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.project.kathai.model.Book;
import com.project.kathai.repository.BookRepository;

public class KathaiApplication {

public static void main(String[] args) {
	
try
    {
      // create our mysql database connection
      String myDriver = "com.mysql.cj.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/kathai";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "rigani", "Modao");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM mytable";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
        int Book_Id = rs.getInt("Book_Id");
        String Title = rs.getString("Title");
        String Authors = rs.getString("Authors");

		Book book =new Book(Book_Id, Title, Authors);
		book.setBook_Id(Book_Id);
		book.setTitle(Title);
		book.setAuthors(Authors);
		BookRepository.saveAll(book);
        
        // print the results
        System.out.format("%s, %s, %s\n", Book_Id, Title, Authors);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

	}
	

}
