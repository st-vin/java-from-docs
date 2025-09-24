/*Anonymous Class with Interface (Medium)

**Concept: Anonymous Classes**

Create an interface `Calculator` and use anonymous classes to implement different operations. */

interface Calculator {
    int calculate(int a, int b);
}

public class MathOperations {
    public static void performOperations(int x, int y) {
        Calculator adder = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        Calculator subtract = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        System.out.println("Addition: " + adder.calculate(x, y));
        System.out.println("Multiplication: " + multiply.calculate(x, y));
        System.out.println("Subtraction: " + subtract.calculate(x, y));
    }
    public static void main(String[] args) {
        performOperations(10, 5);
    }
}