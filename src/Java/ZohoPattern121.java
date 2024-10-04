package Java;
import java.util.*;
import java.util.Scanner;

public class ZohoPattern121 {
	
public static void main (String [] args) {
// Pattern 
	System.out.println("Enter the number of lines");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	for (int i = 1; i<= a; i++) {
		for  (int k = a; k>i; k--) {
			System.out.print(" ");
		}
		for (int j = i; j>=1; j--) 
		
		{
			
		System.out.print(j);
				
		}
		System.out.println();
	}
	
}
}