package Task5;
import java.util.*;
public class Reversed_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Reverse the string which is given as input:
		System.out.println("Enter a String Value");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		String reversed = "";
		
		for (int i=st.length()-1; i>=0; i--) {
			reversed += st.charAt(i);
		}
		System.out.println("Reversed String is " + reversed);
		sc.close();
	}

}
