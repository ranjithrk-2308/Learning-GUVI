package ArrayListSample;
import java.util.*;
public class SampleArraylist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ranjith");
		names.add("Kumar ");
		names.add("Surya");
		System.out.println("Direct Print  : ");
		System.out.println(names);
		
		System.out.println("Print using For each  :");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("Using for loop  :");
		
		for (int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("Using Iterator  :");
		
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}		
		// Access the element:
		
		System.out.println("Get and Set method   :");
		
		System.out.println("Before Value  : " + names.get(1));
		names.set(1,"Thara");
		System.out.println("After Value change :" + names.get(1));
				
		// Using Sorting
		System.out.println("Using Sort method   :");

		System.out.println("Before Sort  : " +names);
		Collections.sort(names);
		System.out.println("After Sort  : "+names);
	}

}
