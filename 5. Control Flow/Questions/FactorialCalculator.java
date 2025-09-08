/*Factorial:

Challenge: Write a program that calculates the factorial of a non-negative integer.
Target Concept: for loop to iterate a specific number of times and perform calculation.
Input: Integer (non-negative)
Output: Long (factorial result) */

class FactorialCalculator {
    public static void main(String[] args) {
        int num = 0;
        long factorial = 1;
        if (num < 0) {
            System.out.println("Enter a positive number!");
        } else if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println(num + " Factorial is " + factorial);
        }
    }
}