package Chapter02;

// Exercise10.java
// Write a program that calculates the energy needed
// to heat water from an initial temperature to a final temperature. Your program
// should prompt the user to enter the amount of water in kilograms and the initial
// and final temperatures of the water. 
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Input to enter water in kilograms
		System.out.print("Enter the amount of water in kilograms: ");
		double waterKilograms = input.nextDouble();
		
		// Input to enter initital temperature
		System.out.print("Enter the initital temperature: ");
		double initialTemperature = input.nextDouble();
		
		// Input to enter final temperature
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		// Calculate the energy needed
		double energy = waterKilograms * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is " + energy);
		
		input.close();
	}
}
