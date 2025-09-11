/*Palindrome Check (Iterative):

Challenge: Write a function that determines if a given string is a palindrome (reads the same forwards and backward). You should use an iterative approach (loops).
Target Concept: Iterative approach (looping through the string), string manipulation.
Input: String
Output: Boolean (True if palindrome, False otherwise) */

import java.util.Scanner;

class palindromeIterative {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        System.out.println(isPalindrome(input));
        sc.close();
    }
}