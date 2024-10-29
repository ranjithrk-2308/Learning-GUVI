package Task7;
import java.util.*;

public class AgeValidation {
    // Method to validate age
    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18. You are not eligible.");
        } else {
            System.out.println("Age is valid. You are eligible.");
        }
    }
 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        try {
            // Get user input for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Validate age
            validateAge(age);
        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Closing the scanner
        }
    }
}