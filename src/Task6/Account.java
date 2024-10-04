package Task6;
import java.util.Scanner;
public class Account {
	// Private data members
    private int accountNumber;
    private double balance;
 
    // No-argument constructor (default values)
    public Account() {
        this.accountNumber = 0;  // Default account number
        this.balance = 0.0;      // Default balance
    }
 
    // Constructor with account number and initial balance
    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
 
    // Method to deposit money
    public void deposit() {
    	System.out.println("Enter the Deposit Amount");
    	Scanner sc = new Scanner (System.in);
    	double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
 
    // Method to withdraw money
    public void withdraw() {
    	System.out.println("Enter the Withdraw amount ");
    	Scanner sc = new Scanner (System.in);
    	double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
 
    // Method to check the balance
    public void checkBalance() {
        System.out.println("Current balance: Rs" + balance);
        System.out.println();      
    }
 
    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
 
    // Main method to test the Account class
    public static void main(String[] args) {
        // Using no-argument constructor
        Account acc1 = new Account();
        System.out.println("Account 1 (default):");
        acc1.checkBalance();  // Check balance
 
        // Using constructor with account number and initial balance
        Account acc2 = new Account(12345, 50000.0);
        System.out.println("\nAccount 2 (with initial balance):");
        acc2.checkBalance();  // Check balance
 
        // Deposit money
        acc2.deposit();
        acc2.checkBalance();  // Check balance after deposit
 
        // Withdraw money
        acc2.withdraw();
        acc2.checkBalance();  // Check balance after withdrawal
 
        // Try withdrawing more than the balance
        acc2.withdraw();
        acc2.checkBalance();
    }
	
}
