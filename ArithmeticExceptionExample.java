package Assignment;

/**
 * Program to demonstrate ArithmeticException in modular arithmetic.
 * This program performs modulus operation with zero to trigger an ArithmeticException.
 */
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ArithmeticException Example with Modulus ===");
        int dividend = 25;
        int divisor = 0;

        try {
            // Attempt modulus operation with zero
            int result = dividend % divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting the modulus calculation.");
        }
    }
}
