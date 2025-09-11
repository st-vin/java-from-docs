/*Prime Number Checker (Recursive):

Challenge: Write a recursive function to determine if a given integer is a prime number.
Target Concept: Recursion, base cases, and the logic for prime number checking.
Input: Integer
Output: Boolean (True if prime, False otherwise) */

import java.util.Scanner;

class PrimeRecursive {

    public static boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor * divisor > num) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor + 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(isPrime(num, 2));
        scanner.close();
    }
    
}
    
