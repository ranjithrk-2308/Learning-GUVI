package Task6;
import java.util.*;
public class Circle {
	 // Private data member
    private double radius;
 
    // No-argument constructor (default radius)
    public Circle() {
    	System.out.print("Enter the Radius of the Circle:");
    	Scanner sc = new Scanner(System.in);
        this.radius = sc.nextDouble();  // Default radius
    }
 
    // Constructor with radius as an argument
    public Circle(double radius) {
        this.radius = radius;
    }
 
    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
 
    // Getter for radius
    public double getRadius() {
        return radius;
    }
 
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    // Main method to test the Circle class
    public static void main(String[] args) {
        // Using the no-argument constructor
        Circle circle1 = new Circle();
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Circumference: " + circle1.calculateCircumference() + "\n");
 
        // Using the constructor with radius as argument
        double a;
        System.out.print("Enter the Circle 2 Radius");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        Circle circle2 = new Circle(a);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Circumference: " + circle2.calculateCircumference());
    }
}
