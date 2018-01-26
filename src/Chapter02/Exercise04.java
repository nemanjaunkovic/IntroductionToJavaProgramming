package Chapter02;

import java.util.Scanner;

// Exercise04.java
// Write a program that converts pounds into kilograms. 
// The program prompts the user to enter a number in pounds, converts it
// to kilograms, and displays the result. One pound is 0.454 kilograms.

public class Exercise04 {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Get input in pounds from user
		System.out.print("Enter number in pounds: ");
		double pounds = input.nextDouble();
		
		// Convert pounds to kilograms
		double kilograms = pounds * 0.454;
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
		
		input.close();
	}
}
