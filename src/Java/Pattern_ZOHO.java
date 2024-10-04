package Java;

import java.util.Scanner;

public class Pattern_ZOHO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of lines");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i<= a; i++) {
			for  (int k = i; k<=a; k++) {
				System.out.print(k);
			}
			for (int j = 1; j<i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}	
	}
}
