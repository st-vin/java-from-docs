/**Array Manipulation - Sum of Elements

Problem: Given an array of integers, calculate and print the sum of all the elements in the array. */

public class SumArray {
    public static void main(String[] args) {
        int [] score = {5, 6, 7};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum);
    }
}