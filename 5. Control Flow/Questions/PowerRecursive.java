/*Power Function (Recursive):

Challenge: Write a recursive function to calculate the power of a number (x raised to the power of y).
Target Concept: Recursion, base case (y=0), and calculation.
Input: Integer (base), Integer (exponent)
Output: Long (result of xy) */

import java.util.Scanner;

class PowerRecursive {
    public static long power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp -1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent: ");
        int exp = scanner.nextInt();

        System.out.println(power(base, exp));

        scanner.close();
    }
}