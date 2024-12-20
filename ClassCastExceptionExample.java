package Assignment;

/**
 * Program to demonstrate ClassCastException.
 * This program performs an invalid type cast with a collection to trigger a ClassCastException.
 */
import java.util.ArrayList;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ClassCastException Example with Collections ===");

        try {
            // Create a list of Integers
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(20);

            // Attempt to cast the list to an incompatible type
            ArrayList<String> strings = (ArrayList<String>) (Object) numbers;
            String value = strings.get(0); // Access the first element
        } catch (ClassCastException e) {
            // Catch block to handle ClassCastException
            System.out.println("ClassCastException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting invalid type cast with collections.");
        }
    }
}
