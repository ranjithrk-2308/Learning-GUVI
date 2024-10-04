package Task6;
import java.util.*;
public class Employee {

	 // Private attributes
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
 
    // Constructor to initialize the Employee object
    public Employee(int id, String firstName, String lastName, double salary) {
this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
 
  
	// Getter for id
    public int getID() {
        return id;
    }
 
    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }
 
    // Getter for lastName
    public String getLastName() {
        return lastName;
    }
 
    // Method to get full name (firstName + lastName)
    public String getName() {
        return firstName + " " + lastName;
    }
 
    // Getter for salary
    public double getSalary() {
        return salary;
    }
 
    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
 
    // Method to calculate the annual salary
    public double getAnnualSalary() {
        return salary * 12;  // Assuming salary is monthly
    }
 
    // Method to raise salary by a specified percentage
    public double raiseSalary(int percent) {
        salary += salary * percent / 100;  // Increase salary by the given percentage
        return salary;
    }
 
    // toString method to return employee details in the specified format
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
 
    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
    	Scanner sc = new Scanner (System.in);
    	System.out.print("Enter the ID : " );
    	int id = sc.nextInt();
    	System.out.print("Enter the First Name : " );
    	String fname = sc.next();
    	System.out.print("Enter the Second Name : " );
    	String sname = sc.next();
    	System.out.print("Enter the Salary  : " );
    	double salary = sc.nextDouble();
    	
        Employee employee = new Employee(id, fname, sname, salary);
 
        // Printing initial details
        System.out.println(employee);
 
        // Raising salary by 10% and printing updated details
        employee.raiseSalary(20);
        System.out.println("After 10% raise: " + employee);
 
        // Printing annual salary
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
    }
}
