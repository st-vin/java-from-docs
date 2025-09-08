/**Accessing Array Elements

Problem: Given an array grades containing the scores of 5 students, print the score of the 3rd student (index 2) */

public class AccessArray {
    public static void main(String[] args) {
        int [] grades = {85, 92, 78, 95, 88};
        int thirdStudentScore = grades[2];
        System.out.println("The 3rd Student's is: " + thirdStudentScore);
    }
}