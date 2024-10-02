package task4JAT;
import java.util.*; 
public class Swapping_of_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Swapping of values
		
		System.out.println("Enter the first Integer");
		Scanner sc1 = new Scanner (System.in);
		int num1 = sc1. nextInt();
		
		System.out.println("Enter the Second Integer");
		Scanner sc2 = new Scanner (System.in);
		int num2 = sc2. nextInt();
		
		System.out.println("The Values Before the swap " + num1 +" "+ num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The Values after Swap " + num1 +  " " + num2 );
		
	}

}
