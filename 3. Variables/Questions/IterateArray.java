/** 3: Iterating Through an Array

Problem: Print each element of the array names (containing names of 4 people). */

public class IterateArray {
    public static void main(String[] args) {
        String [] names = {"House", "Cuddy", "Foreman", "Chase"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Dr. " + names[i]);
        }
    }
}