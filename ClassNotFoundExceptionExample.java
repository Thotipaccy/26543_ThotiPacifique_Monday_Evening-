package Assignment;

/**
 * Program to demonstrate ClassNotFoundException.
 * This program attempts to load a non-existent JDBC driver to trigger a ClassNotFoundException.
 */
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ClassNotFoundException Example with JDBC Driver ===");
        try {
            // Attempting to load a non-existent JDBC driver
            Class.forName("com.fake.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // Catch block to handle ClassNotFoundException
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to load the JDBC driver.");
        }
    }
}
