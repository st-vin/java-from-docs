/** 4: Multi-Dimensional Array (2D)

Problem: Create a 2D array (3 rows, 2 columns) to store the results of a test for 3 students, with 2 subjects. Initialize the array with some sample values. Print all the values in the array. */

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] testResults = {
            {80, 92},
            {78, 85},
            {90, 88},
        };
        for (int i = 0; i < testResults.length; i++) {
            for (int j = 0; j < testResults[i].length; j++) {
                System.out.println("Results[" + i + "][" + j + "] = " + testResults[i][j]);
            }
        }
    }
}