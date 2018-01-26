package Chapter02;

// Exercise12.java
// Given an airplane’s acceleration a and take-off
// speed v, you can compute the minimum runway length needed for an airplane to
// take off 
import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Input for entering speed and acceleration
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double length = (speed * speed) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is " + length);
		
		input.close();
	}
}
