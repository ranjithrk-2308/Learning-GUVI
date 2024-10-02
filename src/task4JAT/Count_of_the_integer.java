package task4JAT;
import java.util.*;
public class Count_of_the_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// The program is to count the digits of the integer:
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the Integer");
        int int1 = SC.nextInt();
        
        int count= 0;
        
        if (int1 < 0) {
        	int1 = -int1;
        	
        }
        do {
        	int1 /= 10;
        	count++;
        	
        }while (int1 !=0);
        System.out.println("The number of digits entered is " + count);
        SC.close();
	}

}
