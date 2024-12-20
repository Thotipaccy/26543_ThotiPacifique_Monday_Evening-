package Assignment;
import java.io.*;

/**
 * Program to demonstrate IOException.
 * This program attempts to write to a file without proper permissions,
 * triggering an IOException.
 */
public class IOExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== IOException Example with File Writing ===");

        String fileName = "restricted_file.txt";

        try {
            // Attempting to write to a file without proper permissions
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is a test.");
            writer.close();
        } catch (IOException e) {
            // Catch block to handle IOException
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to write to the file.");
        }
    }
}
