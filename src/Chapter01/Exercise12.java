package Chapter01;

// Exercise12.java
// Assume a runner runs 24 miles in 1 hour, 40 minutes,
// and 35 seconds. Write a program that displays the
// average speed in kilometers per hour.

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println((24 / ( 1 + (40 + 35.0 / 60.0) / 60.0)) * 1.6);
    }
}