// Custom exception extending the Exception class (checked exception)
class InvalidAgeException extends Exception {
    // Constructor to pass the error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class SimpleCustomExceptionExample {
    // Method to validate age for voting eligibility
    public static void validateAge(int age) throws InvalidAgeException {
        // If age is less than 18, throw a custom exception
        if (age < 18) {
            throw new InvalidAgeException("Person not eligible for voting");
        }
        // If age is valid, print a success message
        System.out.println("Person is eligible for voting");
    }

    public static void main(String[] args) {
        try {
            // Validate a person with age 15 (will throw an exception)
            validateAge(15);
            // Validate a person with age 45 (won't throw an exception)
            validateAge(45);
        } catch (InvalidAgeException e) {
            // Catch and print the custom exception message
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
