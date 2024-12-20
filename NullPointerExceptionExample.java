package Assignment;

/**
 * Program to demonstrate NullPointerException.
 * This program attempts to call a method on a null object reference to trigger a NullPointerException.
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== NullPointerException Example with Object Method Call ===");

        try {
            // Create a null object reference
            Person person = null;
            // Attempt to call a method on a null object
            person.getName();  // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Catch block to handle NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to access null object reference.");
        }
    }

    /**
     * A simple Person class with a getName() method.
     */
    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
