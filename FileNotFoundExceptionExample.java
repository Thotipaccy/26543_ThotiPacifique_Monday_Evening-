package Assignment;

import java.io.*;

/**
 * Program to demonstrate FileNotFoundException.
 * This program attempts to open a missing configuration file to trigger a FileNotFoundException
 * and handles it using a try-catch block.
 */
public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== FileNotFoundException Example with Configuration File ===");

        String configFileName = "config.properties";

        try {
            // Attempting to read a missing configuration file
            BufferedReader reader = new BufferedReader(new FileReader(configFileName));
            System.out.println("Reading configuration file...");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // Catch block to handle FileNotFoundException
            System.out.println("FileNotFoundException caught: Configuration file '" + configFileName + "' not found.");
        } catch (IOException e) {
            // Catch block to handle other IOExceptions
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to read the configuration file.");
        }
    }
}

