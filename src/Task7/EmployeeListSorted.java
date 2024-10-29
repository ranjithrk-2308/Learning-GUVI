package Task7;
import java.util.*;
public class EmployeeListSorted {
	public static void main(String[] args) {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
 
        // Add employee IDs and names to the TreeMap
        employeeMap.put(102, "John");
        employeeMap.put(101, "Alice");
        employeeMap.put(104, "David");
        employeeMap.put(103, "Mary");
 
        System.out.println("Employee names in alphabetical order:");
 
        // Sort by names using values
        employeeMap.values().stream()
                .sorted()
                .forEach(System.out::println);
    }
	
}
