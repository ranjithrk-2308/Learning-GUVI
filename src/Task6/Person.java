package Task6;

public class Person {
	// Private attributes
    private String name;
    private int age;
 
    // Constructor to initialize name and age
    	public Person(String name, int age) {
    	this.name = name;
        this.age = age;
    }
 
    // Getter method for name
    public String getName() {
        return name;
    }
 
    // Getter method for age
    public int getAge() {
        return age;
    }
 
    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person = new Person("John", 30);
 
        // Accessing the attributes using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
