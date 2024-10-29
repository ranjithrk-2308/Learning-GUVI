package Task7;

import java.util.*;

public class ArrayIndexOutOfBoundEXCEPTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.print("Enter the place numer to display in an array:");
			Scanner sc = new Scanner (System.in);
			int a = sc.nextInt();
			
            int[] array = {1, 2, 3, 4, 5,6,7};
            // Attempting to access an index out of bounds
            
            System.out.println(  "The Value in the place if "+ a +" is "+array[a]);  // Array has indices 0 to 4, so this will throw an exception
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
		
		 try {
				System.out.print("Enter the place number to display in an String :");
				Scanner sc = new Scanner(System.in);
				int st = sc.nextInt();
				
				System.out.println("Enter the place to display in the string :");
	            String str = "Ranjith";
	            // Attempting to access a character at an invalid index
	            
	            System.out.println("The Value in the place " +str.charAt(st));  // String length is 5, valid indices are 0 to 4
	            
	            
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
	        }
	}

}
