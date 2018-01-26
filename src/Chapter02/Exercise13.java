package Chapter02;

// Exercise13.java
// Suppose you save $100 each month into a savings account with 
// the annual interest rate 5%. Thus, the monthly interest 
// rate is 0.05/12 = 0.00417
import java.util.*;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input the amount of savings account
		System.out.print("Enter the monthly savings amount: ");
		double savings = input.nextDouble();
		double interestRate = 0.05/12;
		
		double amount = savings * (1 + interestRate);
		
		amount = (savings + amount) * (1 + interestRate);
		amount = (savings + amount) * (1 + interestRate);
		amount = (savings + amount) * (1 + interestRate);
		amount = (savings + amount) * (1 + interestRate);
		amount = (savings + amount) * (1 + interestRate);
		
		System.out.println("After the sixth month, the account value is $" + amount);
		
		input.close();
	}
}
