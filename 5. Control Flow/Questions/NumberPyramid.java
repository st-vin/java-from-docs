/*Number Pyramid:

Challenge: Print a number pyramid of a specified height. For example, if height is 4:

*
**
***
****
Target Concept: for loop (nested for loops for rows and columns).

Input: Integer (height of the pyramid) */

import java.util.Scanner;

class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}