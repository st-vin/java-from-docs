/*Lambda Expressions Basics (Medium)

**Concept: Lambda Expressions**

Convert the anonymous classes from Exercise 4 to lambda expressions. */

interface Calculator {
    int calculate(int a, int b);
}

public class LamdaCalculator {
    public static void perfomOperations(int x, int y) {
        // lambda expressions are more concise
        Calculator adder = (a, b) -> a + b;
        Calculator multiplier = (a, b) -> a * b;
        Calculator subtractor = (a, b) -> a - b;

        // Alternative syntax with explicit types
        Calculator divider = (int a, int b) -> {
            if (b != 0) {
                return a / b;
            }
            return 0;
        };

        System.out.println("Addition: " + adder.calculate(x, y));
        System.out.println("Multiplication: " + multiplier.calculate(x, y));
        System.out.println("Subtraction: " + subtractor.calculate(x, y));
        System.out.println("Division: " + divider.calculate(x, y));
    }
    public static void main(String[] args) {
        perfomOperations(10, 5);
    }
}