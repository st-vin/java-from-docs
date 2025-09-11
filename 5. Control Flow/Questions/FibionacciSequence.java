/*Fibonacci Sequence:

Challenge: Write a program that prints the first n numbers of the Fibonacci sequence.
Target Concept: for loop, recursion (for a more challenging implementation).
Input: Integer (number of Fibonacci numbers to generate)
Output: Prints the Fibonacci sequence to the console. */

import java.util.Scanner;

class FibionacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        if (n >= 1) System.out.print(first + " ");
        if (n >= 2) System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        sc.close();
    }
}