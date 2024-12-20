package Assignment;

import java.sql.*;

/**
 * Program to demonstrate SQLException.
 * This program attempts to execute an invalid SQL query to trigger a SQLException.
 */
public class SQLExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== SQLException Example with Invalid Query ===");

        try {
            // Establishing a valid database connection (assuming MySQL database)
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "yourusername", "yourpassword");

            // Attempting to execute an invalid SQL query
            Statement statement = connection.createStatement();
            String invalidQuery = "SELECT * FORM non_existent_table"; // Typo in the query
            ResultSet resultSet = statement.executeQuery(invalidQuery);
        } catch (SQLException e) {
            // Catch block to handle SQLException
            System.out.println("SQLException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to execute SQL query.");
        }
    }
}
