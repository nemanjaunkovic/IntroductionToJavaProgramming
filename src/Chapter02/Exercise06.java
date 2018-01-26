package Chapter02;

import java.util.Scanner;

// Exercise06.java
// Write a program that reads an integer between 0 and
// 1000 and adds all the digits in the integer. For example, 
// if an integer is 932, the sum of all its digits is 14.

public class Exercise06 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Input for user to enter number
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int total = 0;
		
		total += (number % 10);
		number /= 10;
		
		total += (number % 10);
		number /= 10;
		
		total += number;
		
		System.out.println("The sum of digits is " + total);
		
		input.close();
	}
}
