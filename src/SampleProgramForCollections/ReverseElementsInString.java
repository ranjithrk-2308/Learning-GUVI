package SampleProgramForCollections;
import java.util.*;
public class ReverseElementsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<String>();
		list.add("Ramkumar");
		list.add("Kamal");
		list.add("Vicky");
		System.out.println("String Before Reverse : "+list);
		
		Collections.reverse(list);
		System.out.println("List After Reverse : "+list);
	}

}
