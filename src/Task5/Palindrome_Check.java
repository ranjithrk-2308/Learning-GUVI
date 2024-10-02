package Task5;
import java.util.*;
public class Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Program to find the string is Palindrome of not using for and if else.
		System.out.println("Enter a String Value");
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		st = st.toLowerCase();
		boolean isPalindrome = true;
		
		for (int i = 0; i < st.length()/2;i++) {
			if (st.charAt(i) != st.charAt(st.length() - i -1) ) {
				
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("The given string is a Palindrome");
		}
		else {
			System.out.println("The Given string is a non palindrome");
		}
		
	}

}
