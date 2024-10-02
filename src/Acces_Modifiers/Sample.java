package Acces_Modifiers;
import java.util.*;
public class Sample {
	
	public int div() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value for A ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Value for B");		
		int num2 = sc.nextInt();
		
		int result = num1 / num2;
		
		System .out.println(result);
		return result;

	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    // For division				
		Sample obj = new Sample();		
		obj.div();
	}
}
