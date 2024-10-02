package Task5;
import java.util.*;
public class Grading_AnnaUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Based on input it should provide the Grade:
		
		System.out.println("Enter your marks");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i > 100 || i <0) {
			System.out.println("Invalid input");
		}
			else {
				if (i==100) {
					System.out.println("Your Grade is S");
				}else if(i <99 && i>=90) {
					System.out.println("Your Grade is A");
				}else if(i<89 && i>=80) {
					System.out.println("Your Grade is B");
				}else if(i<79 && i>=70) {
					System.out.println("Your Grade is C");
				}else if(i<69 && i>=60) {
					System.out.println("Your Grade is D");
				}else if(i<59 && i>=50) {
					System.out.println("Your Grade is E");
				}else if(i<50 && i >=0) {
					System.out.println("Your Grade is F");
				}
			}
			sc.close();
		
	}

}
