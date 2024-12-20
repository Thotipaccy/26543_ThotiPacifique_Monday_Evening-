package Assignment;

/**
 * Program to demonstrate ArrayIndexOutOfBoundsException.
 * This program accesses an invalid index in a String array to trigger an ArrayIndexOutOfBoundsException.
 */
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ArrayIndexOutOfBoundsException Example with String Array ===");

        String[] fruits = {"Apple", "Banana", "Cherry"};

        try {
            // Accessing an invalid index in the String array
            System.out.println("Accessing the 4th fruit: " + fruits[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to access invalid index in String array.");
        }
    }
}
