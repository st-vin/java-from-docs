/*Sum of Digits:

Challenge: Write a program that takes an integer as input and calculates the sum of its digits.
Target Concept: for loop, modulo operator (%), and string conversion (optional for a more elegant solution).
Input: Integer
Output: Integer (sum of digits) */

import java.util.Scanner;

public class SumOfDigits {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits of " + num + " is " + sum);
        scanner.close();
    }
}
