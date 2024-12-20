package Assignment;

/**
 * Program to demonstrate NumberFormatException.
 * This program attempts to convert an invalid floating-point string to a number
 * to trigger a NumberFormatException.
 */
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== NumberFormatException Example with Floating Point ===");

        try {
            // Attempting to convert an invalid floating-point string
            float number = Float.parseFloat("invalid_float");  // Invalid string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting invalid floating-point conversion.");
        }
    }
}
