/*Advanced Enum with Lambda Integration (Hard)

**Concept: Enums + Lambdas + Method References**

Create an advanced enum that uses lambdas and method references for operations. */

interface Operation {
    double apply(double x, double y);
}

enum MathOperation {
    // Using lambdas and method references
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    MULTIPLY("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }),
    POWER("^", Math::pow), // Method reference to Math.pow
    MODULO("%", (x, y) -> {
        if (y == 0) {
            throw new ArithmeticException("Modulo by zero");
        }
        return x % y;
    });
    
    private final String symbol;
    private final Operation operation;
    
    // Enum constructor
    MathOperation(String symbol, Operation operation) {
        this.symbol = symbol;
        this.operation = operation;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public double calculate(double x, double y) {
        return operation.apply(x, y);
    }
    
    public void demonstrate(double x, double y) {
        try {
            double result = calculate(x, y);
            System.out.println(x + " " + symbol + " " + y + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println(x + " " + symbol + " " + y + " = ERROR: " + e.getMessage());
        }
    }
    
    // Static method to find operation by symbol
    public static MathOperation findBySymbol(String symbol) {
        for (MathOperation op : values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Unknown operation symbol: " + symbol);
    }
    
    @Override
    public String toString() {
        return name() + "(" + symbol + ")";
    }
}

// Demo class to test the functionality
class MathOperationDemo {
    public static void main(String[] args) {
        // Test all operations
        System.out.println("=== Math Operations Demo ===");
        
        double a = 10.0;
        double b = 3.0;
        
        for (MathOperation op : MathOperation.values()) {
            op.demonstrate(a, b);
        }
        
        System.out.println("\n=== Error Cases ===");
        // Test division by zero
        MathOperation.DIVIDE.demonstrate(10, 0);
        
        // Test modulo by zero
        MathOperation.MODULO.demonstrate(10, 0);
        
        System.out.println("\n=== Finding Operations by Symbol ===");
        try {
            MathOperation foundOp = MathOperation.findBySymbol("+");
            System.out.println("Found operation: " + foundOp);
            foundOp.demonstrate(5, 7);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test with unknown symbol
        try {
            MathOperation unknownOp = MathOperation.findBySymbol("@");
            unknownOp.demonstrate(1, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}