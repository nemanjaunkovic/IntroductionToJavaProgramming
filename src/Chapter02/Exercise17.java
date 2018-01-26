package Chapter02;

// Exercise17.java
// How cold is it outside? The temperature alone
// is not enough to provide the answer. Other factors including wind speed, 
// relative humidity, and sunshine play important roles in determining coldness outside.
// In 2001, the National Weather Service (NWS) implemented the new wind-chill
// temperature to measure the coldness using temperature and wind speed.
import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		// Create object Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter temperature in Fahrenheit
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();
		
		// Prompt user to enter wind speed
		System.out.print("Enter the wind speed(>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		// Compute how cold is outside
		double result = 35.74 + (0.6215 * temperature) 
				- (35.75 * Math.pow(windSpeed, 0.16)) 
				+ (0.4275 * temperature * Math.pow(windSpeed, 0.16));
		
		// Display the result
		System.out.print("The wind chill index is " + result);
		
		input.close();
	}
}
