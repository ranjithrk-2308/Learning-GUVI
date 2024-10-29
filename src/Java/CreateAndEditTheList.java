package Java;
import java.util.*;
public class CreateAndEditTheList {

	public static void main(String[] args) {
        // Create a Scanner object to read input
Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the values
        ArrayList<String> list = new ArrayList<>();
        
        // Get the number of elements in the list
        System.out.print("Enter the Names of elements to be added to the list : ");
        int n = scanner.nextInt();
        
        // Read n elements and add them to the list
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }       
        // Display the list
        System.out.println("List before removal of name : " + list);
        
        // Get the value to remove from the list
        System.out.print("Enter the value to remove: ");
        String valueToRemove = scanner.next();
        
        // Remove the value from the list (if it exists)
        if (list.remove((String) valueToRemove)) {
            System.out.println("Value removed successfully.");
        } else {
            System.out.println("Value not found in the list.");
        }
        
        // Display the list after removal
        System.out.println("List after removal: " + list);
        
        // Close the scanner
        scanner.close();
    }
}
