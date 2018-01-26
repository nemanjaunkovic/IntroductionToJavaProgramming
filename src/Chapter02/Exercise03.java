package Chapter02;

import java.util.Scanner;

// Exercise03.java
// Write a program that reads a number in feet, converts it
// to meters, and displays the result. One foot is 0.305 meter. 

public class Exercise03 {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
				
		// Get input in feet from user
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		// Convert feet to meters
		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters.");
		
		input.close();
	}
}
