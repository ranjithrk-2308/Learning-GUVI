package Task7;
import java.util.*;
public class ListToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        String[] array = {"Apple", "Banana", "Orange"};
 
        List<String> list = new ArrayList<>(Arrays.asList(array));
 
        System.out.println("Modifiable List: " + list);
        System.out.println("Enter the String to be added to the present list");
        String str = sc.next();
        
        list.add(str);
 
        // Display the updated list
        System.out.println("Updated List: " + list);
    	sc.close();
    }
}
