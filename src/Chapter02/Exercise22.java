package Chapter02;

// Exercise22.java
// 

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount as dollars and cents: ");
		int dollars = input.nextInt();
		int cents = input.nextInt();

		int remainingAmount = dollars * 100 + cents;

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;

		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		// Display results

		System.out.println("Your amount " + dollars + "." + cents + " consists of");
		System.out.println("   " + numberOfOneDollars + " dollars");
		System.out.println("   " + numberOfQuarters + " quarters ");
		System.out.println("   " + numberOfDimes + " dimes");
		System.out.println("   " + numberOfNickels + " nickels");
		System.out.println("   " + numberOfPennies + " pennies");
		
		input.close();
	}
}
