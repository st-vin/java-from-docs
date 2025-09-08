/**Sum of Numbers

Problem: Write a Java program that prompts the user to enter three numbers. Calculate the sum of these numbers and print the result.
Formula: Sum = number1 + number2 + number3
Example Input: 10, 20, 30
Expected Output: 60.0 */
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the 1st number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the 3rd number: ");
        int third = scanner.nextInt();

        int sum = first + second + third;

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}