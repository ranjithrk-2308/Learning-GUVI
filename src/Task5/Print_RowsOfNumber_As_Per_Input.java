package Task5;
import java.util.*;
public class Print_RowsOfNumber_As_Per_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// The program print the integers as rows based on the input
		
		System.out.println("Enter the integer Value ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num = 1;
		
		for (int i = 1; i<= input; i++) {
			for(int j = 1; j<=i  ; j++ ) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		
	sc.close();	
	}

}
