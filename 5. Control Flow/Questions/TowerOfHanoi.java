/*Tower of Hanoi:

Challenge: Implement the Tower of Hanoi puzzle. This will involve a recursive solution.
Target Concept: Recursion, base case, and the logic for moving disks between pegs.
Input: Integer (number of disks)
Output: Prints the steps required to solve the puzzle to the console. */

import java.util.Scanner;

public class TowerOfHanoi {
    public static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solve(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        solve(n, 'A', 'C', 'B');
        sc.close();
    }
}
