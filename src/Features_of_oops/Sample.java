package Features_of_oops;
import java.util.*;


class Add {
	
	static int num1;
	static int num2;
	Add (int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		
	} 
	public static void res(){
		int result;
		result = num1+num2;
	}
	
}

public class Sample extends Add {
	


	Sample(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add obj = new Add(10, 12);
		
	}

}
