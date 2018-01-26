package Chapter02;

// Exercise16.java
// Write a program that prompts the user to enter the
// side of a hexagon and displays its area.
import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
		// Create object from Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter side of hexagon
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		// Compute area of hexagon
		double result = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
		
		// Display the result
		System.out.println("The area of hexagon is " + result);
		
		input.close();
	}
}
