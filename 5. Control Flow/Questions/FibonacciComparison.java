public class FibonacciComparison {

    // 1. Recursive method (inefficient for large n)
    public static long recursiveFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    // 2. Binet's Formula (closed form using golden ratio)
    public static long binetFib(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        return Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }

    // 3. Matrix exponentiation method
    public static long matrixFib(int n) {
        if (n == 0) return 0;
        long[][] result = {{1, 0}, {0, 1}}; // identity matrix
        long[][] fibMatrix = {{1, 1}, {1, 0}};
        power(fibMatrix, n - 1, result);
        return result[0][0];
    }

    private static void power(long[][] base, int exp, long[][] result) {
        while (exp > 0) {
            if ((exp & 1) == 1) {
                multiply(result, base);
            }
            multiply(base, base);
            exp >>= 1;
        }
    }

    private static void multiply(long[][] a, long[][] b) {
        long x = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        long y = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        long z = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        long w = a[1][0] * b[0][1] + a[1][1] * b[1][1];

        a[0][0] = x;
        a[0][1] = y;
        a[1][0] = z;
        a[1][1] = w;
    }

    // 4. Iterative method
    public static long iterativeFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long prev2 = 0, prev1 = 1, current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    // Utility method to test each approach with timing + memory
    public static void testFibMethod(String methodName, int n, java.util.function.IntFunction<Long> fibMethod) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // request garbage collection

        long beforeMem = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        long result = fibMethod.apply(n);

        long endTime = System.nanoTime();
        long afterMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println(methodName + " (n=" + n + "): " + result);
        System.out.println("   Time: " + (endTime - startTime) + " ns");
        System.out.println("   Memory used: " + (afterMem - beforeMem) + " bytes\n");
    }

    public static void main(String[] args) {
        int n = 40; // Adjust for testing — recursive gets slow beyond ~45

        testFibMethod("Recursive", n, FibonacciComparison::recursiveFib);
        testFibMethod("Binet's Formula", n, FibonacciComparison::binetFib);
        testFibMethod("Matrix Form", n, FibonacciComparison::matrixFib);
        testFibMethod("Iterative", n, FibonacciComparison::iterativeFib);
    }
}
