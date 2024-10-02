//Finding Factorial:
package task4JAT;
import java.util.*;
public class Factorial {
	
	public static int factorial (int N) {
		if (N == 0 || N == 1) {
			return 1;
		}else {
			return N* factorial(N - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int num = sc.nextInt();
		
		System.out.println( num + "!=" + factorial(num));
	}

}
