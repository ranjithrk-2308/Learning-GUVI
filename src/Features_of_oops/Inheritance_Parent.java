package Features_of_oops;
import java.util.*;
// TODO Auto-generated method stub
// Inheritance Sample:
// Acquiring all the properties form Parent Class to the Child Class:
// extends Keyword is used to acquire the methods and the variables in the parent Class.
	
	 public class Inheritance_Parent{
		 
	Scanner sc = new Scanner (System.in);	 
		
		 public void  Add()   {
			 System.out.println("Enter 2 Values");
			 int num1 = sc.nextInt();
			 int num2 = sc.nextInt();
			int result;		
			 result = num1 + num2;
				System.out.println("The sum of the 2 values is " + result);	 
		 } 
		 public void Sub (int num1, int num2) {
			 int result = num1-num2;
			 System.out.println("The Sub of the given number is " + result);
		 }
		 public void Mul (int num1, int num2) {
			 int result = num1*num2;
			 System.out.println("The Mul of the given number is " + result);
		 }
		 public void Div (int num1, int num2) {
			 int result = num1/num2;
			 System.out.println("The Div of the given number is " + result);

		 }
	 }
 
