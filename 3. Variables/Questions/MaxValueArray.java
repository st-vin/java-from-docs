/**7: Array Manipulation - Finding the Maximum

Problem: Given an array of integers, find and print the largest element in the array. */

public class MaxValueArray {
    public static void main(String[] args) {
        int [] numbers = {5, 1, 8, 2, 9};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Largest number in the array: " + max);
    }
}