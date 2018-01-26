package Chapter02;

// Exercise19.java
// Write a program that prompts the user to enter
// three points (x1, y1), (x2, y2), (x3, y3) of a 
// triangle and displays its area
import java.util.*;

public class Exercise19 {
	public static void main(String[] args) {
		// Create object from Scanner
		Scanner input = new Scanner(System.in);
		
		// Compute user to enter three points of a triangle
		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Compute distance between 3 sides of triangle
		double result = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double side1 = Math.pow(result, 0.5);

		result = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);
		double side2 = Math.pow(result, 0.5);

		result = Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2);
		double side3 = Math.pow(result, 0.5);
		
		// Compute area of a triangle
		result = (side1 + side2 + side3) / 2;
		result = result * (result - side1) * (result - side2) * (result - side3);
		double area = Math.pow(result, .5);
		
		// Display the area of triangle
		System.out.println("The area of the triangle is " + area);
		input.close();
	}
}
