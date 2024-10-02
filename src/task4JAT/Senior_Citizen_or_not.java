package task4JAT;

import java.util.Scanner;

public class Senior_Citizen_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Senior Citizen or not.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age >= 60) {
			System.out.println("You are a senior citizen");
		}else {
			System.out.println("You are not a senior citizen");
	
		}
	sc.close();	
	}
	
}
