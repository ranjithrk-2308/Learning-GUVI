package Task5;
import java.util.*;
public class Calculate_Room_Fare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Calculate the Peak month, Fare and no of days to stay.		
		
	System.out.println("Enter the Month rent and Day of stay");	
	Scanner sc = new Scanner (System.in);	
	
	int month = sc.nextInt();
	double rentperday = sc.nextDouble();
	int howmanydaystayed = sc.nextInt();
	
	switch (month) {
	
	case 1:
	case 2:
	case 3:
	case 4:
		
		rentperday += rentperday * 0.20; // Add 20% for peak season
    break;
	case 5:
		
		rentperday += rentperday * 0.20; // Add 20% for peak season
    break;
	case 6:
		
		rentperday += rentperday * 0.20; // Add 20% for peak season
    break;
	case 7:
	case 8:
	case 9:
	case 10:
		
		rentperday += rentperday * 0.20; // Add 20% for peak season
    break;
	case 11:
		
		rentperday += rentperday * 0.20; // Add 20% for peak season
    break;
	case 12:
		
        rentperday += rentperday * 0.20; // Add 20% for peak season
        break;
    default:
    	System.out.println("Month Does not exist");
        break;
}

// Calculate the total tariff
double totalTariff = rentperday * howmanydaystayed;

// Output the total tariff with two decimal places
System.out.printf("%.2f%n", totalTariff);
	}		
}

