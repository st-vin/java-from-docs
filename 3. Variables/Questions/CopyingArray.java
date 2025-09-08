/**5: Copying an Array

Problem: Create an array original with values {1, 2, 3}. Create a new array copied that is a copy of the original array. Print both arrays to verify. */

public class CopyingArray {
    public static void main(String[] args) {
        int [] original = {1, 2, 3};
        int [] copied = original.clone();// or  int[] copied = Arrays.copyOf(original, original.length);

        System.out.println("Original Array: ");
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i] + " ");
        }
        System.out.println();

        System.out.println("Copied array: ");
        for (int i = 0; i < copied.length; i++) {
            System.out.println(copied[i] + " ");
        }
        System.out.println();
    }
}