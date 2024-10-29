package Features_of_oops;
import java.util.*;
public class Common extends CurrentSalaryParent {
	
	public void name() {
	System.out.println("Enter your name");
	Scanner sc = new Scanner(System.in) ;
	String st = sc.next();
	}
	public void company() {
		System.out.println("Enter your Company name");
		Scanner sc = new Scanner(System.in) ;
		String st = sc.next();
		}
	public void age() {
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in) ;
		int st = sc.nextInt();
		}
}
