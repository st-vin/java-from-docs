/*Anonymous Classes

**Question:** Create a program that uses anonymous classes to implement different sorting strategies for a list of strings.
Create anonymous implementations of a `Comparator` interface. */

import java.util.*;

public class SortingDemo {

    interface StringProcessor {
        String process(String input);
    }

    public void demonstrateAnonymousClasses() {
        List<String> words = Arrays.asList("apple, Banana", "cherry", "DATE", "elderberry");

        System.out.println("Original list: " + words);

        // Anonymous class for case-insensitive sorting
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare (String s1, String s2) {
                return s1.toLowerCase().compareTo(s2.toLowerCase());
            }
        });
        System.out.println("Case-insensitive sort: " + words);

        //Reset List
        words = Arrays.asList("apple", "Banana", "cherry", "DATE", "elderberry");

        // Anonymous class for length-based sorting
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return Integer.compare(s1.length(), s2.length());
                }
                return s1.compareTo(s2);
            }
        });
        System.out.println("Length-based sort: " + words);
        
        // Anonymous class for custom string processing
        StringProcessor processor = new StringProcessor() {
            @Override
            public String process(String input) {
                return "Processed: " + input.toUpperCase() + " (length: " + input.length() + ")";
            }
        };
        
        System.out.println("\nString processing:");
        for (String word : Arrays.asList("hello", "world", "java")) {
            System.out.println(processor.process(word));
        }
    }
    
    public static void main(String[] args) {
        SortingDemo demo = new SortingDemo();
        demo.demonstrateAnonymousClasses();
    }
}
