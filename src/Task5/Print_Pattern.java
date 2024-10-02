package Task5;
import java.util.*;
public class Print_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Print Pattern as per the input:
		System.out.println("Enter the Value");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i = 1; i<= input; i++) {
			if (i%2 == 0) {
				System.out.println("*");
			}
			else {
				System.out.println("**");
			}
		}
		
		sc.close();
	}

}
