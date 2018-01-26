package Chapter02;

import java.util.Scanner;

// Exercise23.java
// Write a program that prompts the user to enter the distance to
// drive, the fuel efficiency of the car in miles per gallon, and the 
// price per gallon, and displays the cost of the trip.

public class Exercise23 {
	public static void main(String[] args) {
		// Create object from Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter driving distance
		System.out.print("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		
		// Prompt user to enter miles per gallon
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		// Prompt user tp enter price per gallon
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		// Calculate cost of driving
		double cost = (drivingDistance / milesPerGallon) * pricePerGallon;
		
		// Display cost of driving
		System.out.println("The cost of driving is $" + cost);
		
		input.close();
	}
}
