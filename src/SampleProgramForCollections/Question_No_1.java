package SampleProgramForCollections;
import java.util.*;
public class Question_No_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list = new ArrayList<String>();
		list.add("Ranjith");
		list.add("Kamal");
		list.add("Vicky");
		
		System.out.println(list);
		
		System.out.println("Iterating using For - Each loop");
		
		for (String name : list) {
			System.out.println(name);
			
		}	
		
		System.out.println("Interating using For loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterating using Iterator");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
						System.out.println(it.next());
		}
	}
}
