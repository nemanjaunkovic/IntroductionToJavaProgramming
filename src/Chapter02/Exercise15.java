package Chapter02;

// Exercise15.java
// Write a program that prompts the user to enter
// two points (x1, y1) and (x2, y2) and displays their distance between them
import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		// Create object from Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt for user to enter x1 and y1 points
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// Prompt for user to enter x2 and y2 points
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Computing the distance
		double result = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		result = Math.pow(result, .5);
		
		System.out.println("The distance between the two points is " + result);
		
		input.close();
	}
}
