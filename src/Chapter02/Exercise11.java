package Chapter02;

//
// Rewrite Programming Exercise 1.11 to prompt the user
// to enter the number of years and displays the population after the number of years.
// Use the hint in Programming Exercise 1.11 for this program. The population
// should be cast into an integer. 
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// initialize
		int population = 312_032_486;
		int secondsInYear = 31_556_926;
		int babyByYear = secondsInYear / 7;
		int deathByYear = secondsInYear / 13;
		int immigrantsByYear = secondsInYear / 45;
		
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		population += (babyByYear * years) - (deathByYear * years) 
				+ (immigrantsByYear * years);
		
		System.out.println("The population in " + years + " years is " + population);
		
		input.close();
	}
}
