package Features_of_oops;
import java.util.*;
public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub

			System.out.println("Enter the Value a");
			Scanner sc1 = new Scanner(System.in);
			int a = sc1.nextInt();
			
			System.out.println("Enter the Value B");
			Scanner sc2 = new Scanner(System.in);
			int b = sc2.nextInt();
			
			Childsample obj = new Childsample();
			obj.add(a, b);
			obj.sub(a, b);
			obj.Mul(a, b);
			obj.Div(a, b);
	}
}
