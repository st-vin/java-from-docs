/**
 Calculate Area of a Rectangle

Problem: Write a Java program that prompts the user to enter the length and width of a rectangle. Calculate the area of the rectangle and print the result.
Formula: Area = length * width
Example Input: length = 5, width = 10
Expected Output: 50.0
 */

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the Width: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Area: " + area);
        scanner.close();
    }
}