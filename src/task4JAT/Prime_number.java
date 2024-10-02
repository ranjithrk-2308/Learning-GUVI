package task4JAT;
import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Prime number program:
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter an integer ");
		int number = sc.nextInt();
		
		if (isprime(number)) {
			System.out.println(number + " " + "Is a prime number");
		}else {
			System.out.println(number + " " + "Is a non prime number");
		}
			
	}
		
		public static boolean isprime(int num) {
			if (num <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		return true;
	}

}
