package Chapter02;

// Exercise05.java
// Write a program that reads the subtotal
// and the gratuity rate, then computes the gratuity and total. 
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Input the subtotal and gratuity rate from user
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		gratuityRate = (gratuityRate / 100.0) * subtotal;
		
		// Calculate and display the total
		double total = subtotal + gratuityRate;
		System.out.println("The gratuity is $" + gratuityRate 
				+ " and total is $" + total);
		
		input.close();
	}
}
