/**Boolean - Check if a Number is Positive

Problem: Write a Java program that prompts the user to enter a number. Determine if the number is positive, negative, or zero and print the appropriate message.
Example Input: 10
Expected Output: Positive */

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        boolean isPositive = (number > 0);

        if (isPositive) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Zero!");
        } else {
            System.out.println("Negative");
        }
        scanner.close();
    }
}