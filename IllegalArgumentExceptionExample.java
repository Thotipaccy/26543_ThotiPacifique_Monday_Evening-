package Assignment;

/**
 * Program to demonstrate IllegalArgumentException.
 * This program passes an invalid argument to a method to trigger an IllegalArgumentException.
 */
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== IllegalArgumentException Example with Method Argument ===");

        try {
            // Attempting to call a method with an invalid argument
            setAge(-5);  // Invalid argument, age cannot be negative
        } catch (IllegalArgumentException e) {
            // Catch block to handle IllegalArgumentException
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to pass invalid argument.");
        }
    }

    /**
     * A method that sets the age, throws IllegalArgumentException if age is negative.
     */
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age set to: " + age);
    }
}
