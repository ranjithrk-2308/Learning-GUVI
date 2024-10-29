package Task7;
import java.util.*;
public class DivisionSecondNumberIsZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter the Value to be divided");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the Value used to divid");
			int num2 = sc.nextInt();
			
			int num3 = num1/num2;
			System.out.println("The Divided Value is : " + num3);
		
	}catch(ArithmeticException a){
		System.out.println("Error : Cannot Divide a Value with Zero: ");
		

	}finally {
		System.out.println("End of the program");
	}
}
}
