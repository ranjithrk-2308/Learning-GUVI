package task4JAT;
import java.util.*;
public class Odd_or_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Odd or even
		
		System.out.println("Enter an integer");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a %2 == 0 ) {
			
			System.out.println("The given integer is Even number");
		}else {
			
			System.out.println("The given number is ODD number");
		}
	}

}
