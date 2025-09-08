/*Even or Odd:

Challenge: Write a program that takes an integer as input and determines if it's even or odd. Print "Even" or "Odd" accordingly.
Target Concept: if/else statements for conditional execution.
Input: Integer
Output: String ("Even" or "Odd") */

class EvenOdd {
    public static void main(String[] args) {
        int number = 190;
        if (number % 2 == 0) {
            System.out.println(number + " is Even!");
        } else {
            System.out.println(number +" is Odd!");
        }
    }
}