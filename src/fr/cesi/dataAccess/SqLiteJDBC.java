package fr.cesi.dataAccess;
import java.sql.*;

public class SqLiteJDBC {

	 public static void createNewTable( String args[] ) {
		 Connection c = null;
	      Statement stmt = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:students.db");
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "CREATE TABLE STUDENT " +
	                        "(ID INT PRIMARY KEY     NOT NULL," +
	                        " NAME           TEXT    NOT NULL, " + 
	                        " FIRSTNAME            TEXT     NOT NULL, " + 
	                        " ADDRESS        TEXT NOT NULL, " + 
	                        "EMAIL TEXT NOT NULL, "  + 
	                        "PHONENUMER TEXT NOT NULL, " + 
	                        "ABSENCE INT NOT NULL, " +
	                        "REPRESENTATIVE TEXT NOT NULL)"; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");
	 }
	 
	 public static void insert(String args[]) {
		 Connection c = null;
	      Statement stmt = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:students.db");
	         System.out.println("Opened database successfully");
	         
	         String sql = "INSERT INTO students (year_group, firstname, lastname, email, address, phone_number, absence, representative) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
		         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		         System.exit(0);
		      }
		      System.out.println("insert successfully");
	         
	 }
}
