/**1: Declaration and Initialization

Problem: Declare an integer array named numbers of size 5. Initialize it with the values 10, 20, 30, 40, and 50. */

public class DeclareArray {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}