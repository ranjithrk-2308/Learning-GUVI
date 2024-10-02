package task4JAT;
import java.util.*;
public class Sum_AB_is_Greater_than_CD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Define 4 integers a,b,c,d: Write if statement that checks whether the sum of a and b is greater than the sum of c and d, 
// If it is true the program should output the message that the Sum of a and b is greater than the sum of c and d.
	
		System.out.println("Enter the value for a");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();

		System.out.println("Enter the value for a");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		
		System.out.println("Enter the value for a");
		Scanner sc3 = new Scanner(System.in);
		int c = sc3.nextInt();
		
		System.out.println("Enter the value for a");
		Scanner sc4 = new Scanner(System.in);
		int d = sc4.nextInt();
		
		if (a+b > c+d) {
			
			System.out.println("The sum of A and B is Greater than the Sum of C and D");
			
		}else if (a+b == c+d) {
			System.out.println("The sum of A and B is equal to C and D");
		}else {
			System.out.println("The sum of C and D is Greater than the Sum of A and B");
		}
	}

}
