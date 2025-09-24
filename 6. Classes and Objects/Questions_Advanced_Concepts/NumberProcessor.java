/*Local Classes

**Question:** Create a method that uses a local class to process a list of numbers.
The local class should have methods to calculate sum, average, and find the maximum value. */

import java.util.List;
import java.util.Arrays;

public class NumberProcessor {
    public void processNumbers(List<Integer> numbers) {
        final String processorName = "Local Number Processor";

        //Local Class
        class NumberAnalyzer {
            public int calculateSum() {
                return numbers.stream().mapToInt(Integer::intValue).sum();
            }

            public double calculateAverage() {
                return numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            }

            public int findMaximum() {
                return numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
            }

            public void displayResults() {
                System.out.println("=== " + processorName + " Results ===");
                System.out.println("Numbers: " + numbers);
                System.out.println("Sum: " + calculateSum());
                System.out.println("Average: " + String.format("%.2f", calculateAverage()));
                System.out.println("Maximum: " + findMaximum());
            }
        }

        NumberAnalyzer analyzer = new NumberAnalyzer();
        analyzer.displayResults();
    }

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        List<Integer> numbers = Arrays.asList(10, 25, 7, 33, 18, 42, 9);
        processor.processNumbers(numbers);
    }
}