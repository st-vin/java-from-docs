/**String Concatenation

Problem: Write a Java program that prompts the user to enter their first name and last name. The program should then combine these two names into a full name and print the full name.
Formula: Full Name = first name + " " + last name
Example Input: First Name: John, Last Name: Doe
Expected Output: John Doe */

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;

        System.out.println("Full name: " + fullName);

        scanner.close();
    }
}