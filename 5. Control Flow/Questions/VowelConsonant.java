/*Vowel or Consonant:

Challenge: Write a program that takes a character as input and determines if it's a vowel or consonant.
Target Concept: if/else statements, switch statement (for handling different cases based on character), or if/else combined.
Input: Character
Output: String ("Vowel" or "Consonant") */

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch = scanner.next().charAt(0); // Get the first character from the input string

        if (Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u') {
            System.out.println("Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }
        scanner.close();
    }
}
