/**Char - Calculate ASCII Value

Problem: Write a Java program that prompts the user to enter a character. Calculate the ASCII value of the character and print the result.
Example Input: A
Expected Output: 65 (ASCII value of 'A') */

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); //Gets the first character from the input string

        int asciiValue = (int) character; // Casts the character to an integer (ASCII value)

        System.out.println("ASCII value of " + character + " is: " + asciiValue);
        scanner.close();
    }
}