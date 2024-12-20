package Assignment;

import java.io.*;

/**
 * Program to demonstrate EOFException.
 * This program writes a single object to a file and attempts to read multiple objects
 * to trigger an EOFException.
 */
public class EOFExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== EOFException Example with ObjectInputStream ===");

        String fileName = "data_file.txt";

        // Step 1: Write a single object to the file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject("Hello, World!");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Step 2: Attempt to read multiple objects from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            System.out.println("First object: " + ois.readObject());
            System.out.println("Second object: " + ois.readObject()); // Triggers EOFException
        } catch (EOFException e) {
            // Catch block to handle EOFException
            System.out.println("EOFException caught: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to read objects from the file.");
        }
    }
}
