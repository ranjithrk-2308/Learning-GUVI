package SampleProgramForCollections;
import java.util.*;
public class Copy1ListToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		list1.add("6");
		
		ArrayList <String> list2 = new ArrayList<String>();
		list2.add("Kamal");
		list2.add("Vicky");
		list2.add("Alagu");
		list2.add("Arun");
		list2.add("Ragul");
		list2.add("Surya");
		
		System.out.println("List 1 is : " + list1);
		System.out.println("List 2 is : " + list2);
		
		Collections.copy(list1, list2);

		System.out.println("List after Copying List 1 is: "+ list1);
	}

}
