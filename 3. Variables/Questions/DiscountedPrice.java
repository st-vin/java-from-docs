/**Calculate Discounted Price

Problem: Write a Java program that prompts the user to enter the original price of an item and a discount percentage (e.g., 10 for 10%). Calculate the discounted price and print the result.
Formula: Discounted Price = Original Price * (1 - Discount Percentage / 100)
Example Input: Original Price: 100, Discount Percentage: 20
Expected Output: 80.0 */

import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter discount: ");
        double discountPercentage = scanner.nextDouble();

        double discountedPrice = originalPrice * (1 - discountPercentage/100);

        System.out.println("Discounted Price: " + discountedPrice);
        scanner.close();
    }
}