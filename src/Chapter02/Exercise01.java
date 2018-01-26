package Chapter02;

// Exercise01.java
// Write a program that reads a Celsius degree in
// a double value from the console, then converts 
// it to Fahrenheit and displays the result.

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Get input from the user
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		// Convert Celsius to Fahrenheit
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		input.close();
	}
}
