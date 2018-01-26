package Chapter02;

// Exercise20.java
// If you know the balance and the annual
// percentage interest rate, you can compute the 
// interest on the next monthly payment
// Write a program that reads the balance and the annual 
// percentage interest rate and displays the interest for the next month.
import java.util.*;

public class Exercise20 {
	public static void main(String[] args) {
		// Create object from Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter balance and interest rate
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		// Compute the interest
		double interest = balance * (interestRate / 1200);
		
		// Display the interest
		System.out.println("The interest is " + interest);
		
		input.close();
	}
}
