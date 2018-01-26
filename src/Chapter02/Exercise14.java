package Chapter02;

// Exercise14.java
// Body Mass Index (BMI) is a measure of health on weight. 
// It can be calculated by taking your weight in kilograms and
// dividing by the square of your height in meters. Write a program that prompts the
// user to enter a weight in pounds and height in inches and displays the BMI.
import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input weight in pounds
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.45359237;
		
		// Input height in inches
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		double meters = inches * 0.0254;
		
		double bmi = kilograms / (meters * meters);
		
		System.out.println("BMI is " + bmi);
		
		input.close();
	}
}
