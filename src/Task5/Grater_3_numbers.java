package Task5;
import java.util.*;
public class Grater_3_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter B value");

		int b = sc.nextInt();
		System.out.println("Enter C value");

		int c = sc.nextInt();
		
		if (a > b && a>c) {
			System.out.println(a + " Value A Is Greater ");
		}if (b > a && b>c) {
			System.out.println(b + "Value B is Greater");
		}if (c>a && c>b) {
			System.out.println(c + "Value C is Greater ");
		}
		else {
			System.out.println("End of Program");
		}
	sc.close();	
	}

}
