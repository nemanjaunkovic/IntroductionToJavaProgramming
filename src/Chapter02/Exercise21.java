package Chapter02;

// Exercise21.java
// Write a program that reads in investment amount, annual interest rate, 
// and number of years, and displays the future investment value
import java.util.*;

public class Exercise21 {
	public static void main(String[] args) {
		// Create object from Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter investment amount
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		// Prompt user to enter interest rate
		System.out.print("Enter anual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		
		// Prompt user to enter number of years
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * 
				Math.pow(1 + (interestRate / 1200), years * 12);
		System.out.println("Accumulated value is $" + futureInvestmentValue);
		
		input.close();
	}
}
