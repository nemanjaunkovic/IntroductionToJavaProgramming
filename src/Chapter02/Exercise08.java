package Chapter02;

// Exercise08.java
// Listing 2.7, ShowCurrentTime.java, gives a program that displays
// the current time in GMT. Revise the program so that it prompts the user to enter
// the time zone offset to GMT and displays the time in the specified time zone.
import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		// Obtain the total miliseconds since midnight, Jan 1, 1970
		long totalMiliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMiliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hours
		System.out.print("Enter the time zone offset to GMT: ");
		Scanner input = new Scanner(System.in);
		int offset = input.nextInt();
		input.close();
		long currentHour = (totalHours % 24) + offset;

		// Display results
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
}
