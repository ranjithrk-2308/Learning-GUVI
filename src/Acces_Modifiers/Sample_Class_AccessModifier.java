// TODO Auto-generated method stub
// Sample Code for access modifier:
		
package Acces_Modifiers;
import java.util.*;
public class Sample_Class_AccessModifier {
// Variables:
	static int num1;
	static int num2;
	static int result;
	static int num3;
	static int num4;
// Methods:
	public void add() {		
		result = num1 +num2;
		System.out.println("Addition of value is " + result);		
	}	
	public int sub() {
		result = num1 - num2;
		return result;	
	}	
	public int mul() {
		int res = num1 * num2;
		System.out.println("The mul of num1 and num2 is " + res);
		return res;
		
	}
	public static void main(String[] args) {
		Sample_Class_AccessModifier obj = new Sample_Class_AccessModifier();
		Scanner sc = new Scanner(System.in);		
// Reading the value of the variable:
		
		System.out.println("Enter the value for num1 ");
		obj.num1 = sc.nextInt();
		
		System.out.println("Enter Value for num2 ");
		obj.num2 = sc.nextInt();
		
		obj.add();
		obj.mul();
		
		int result = obj.sub();
		System.out.println("The Sub of values is  " + " " + result);

		// To Call static variable and method:
	//	Sample_Class_AccessModifier.num1 = 40;
		//Sample_Class_AccessModifier.num2 = 50;
		
	}
}
