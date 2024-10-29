package Task7;
import java.util.*;
public class AddAndRemoveDataFromList {
	public static void main(String[] args) {
		
        ArrayList<String> stringList = new ArrayList<>();
 
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
 
        // Displaying the ArrayList before removing elements
        System.out.println("ArrayList before removal: " + stringList);
 
        stringList.clear();
 
        // Displaying the ArrayList after removing all elements
        System.out.println("ArrayList after removal: " + stringList);
    }
	
}
