
/**
Temperature Conversion
Problem: Write a Java program that prompts the user to enter a temperature in Celsius. The program should then convert this temperature to Fahrenheit and print the result.
Formula: Fahrenheit = (Celsius * 9/5) + 32
Example Input: 25
Expected Output: 77.0 */

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0/5.0) + 32.0; // Use 9.0/5.0 for floating-point division

        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
        scanner.close();
    }
}