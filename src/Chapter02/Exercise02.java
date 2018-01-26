package Chapter02;

// Exercise02.java
// Write a program that reads in the radius
// and length of a cylinder and computes the area and volume
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Get input radius and length for cylinder from user
		System.out.print("Enter the radius and length of a cylander: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
		input.close();
	}
}
