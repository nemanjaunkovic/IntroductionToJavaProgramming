package Chapter02;

// Exercise07.java
// Write a program that prompts the user to enter the
// minutes (e.g., 1 billion), and displays the number 
// of years and days for the minutes. For simplicity, 
// assume a year has 365 days.
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Input to get number of minutes
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		// Calculate number of years in entered minutes
		long minutesInYear = 60 * 24 * 365;
		long minutesInDay = 60 * 24;
		long years = minutes / minutesInYear;
		
		// Calculate number of days in entered minutes
		long restMinutes = minutes - (years * minutesInYear);
		long days = restMinutes / minutesInDay;
		
		System.out.println(minutes + " minutes is approximetly "+ years 
				+ " years and " + days + " days");
		
		input.close();
	}
}
