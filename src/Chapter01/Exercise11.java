package Chapter01;

// Exercise11.java
// Write a program to display the population for each of the next five years.
// Assume the current population is 312,032,486 and one year has 365 days.

public class Exercise11 {
    public static void main(String[] args) {
        int population = 312_032_486;
        int secondsInYear = 31_556_926;
        int babyByYear = secondsInYear / 7;
        int deathByYear = secondsInYear / 13;
        int immigrantsByYear = secondsInYear / 45;

        population += babyByYear - deathByYear + immigrantsByYear;
        System.out.println("First year: " + population);

        population += babyByYear - deathByYear + immigrantsByYear;
        System.out.println("Second year: " + population);

        population += babyByYear - deathByYear + immigrantsByYear;
        System.out.println("Third year: " + population);

        population += babyByYear - deathByYear + immigrantsByYear;
        System.out.println("Fourth year: " + population);

        population += babyByYear - deathByYear + immigrantsByYear;
        System.out.println("Fifth year: " + population);
    }
}