/*10: Lambda Expression with Annotations

**Task:** Create a functional interface with an annotated method, then use it with lambda expressions and method references. */

@interface Validated {
    String rule();
}

@FunctionalInterface
interface DataProcessor {
    @Validated(rule = "Input must not be null")
    String process(String input);
}

class DataService {
    
    @Validated(rule = "Must return uppercase")
    public static String toUpperCase(String text) {
        return text != null ? text.toUpperCase() : "";
    }
    
    public void demonstrateUsage() {
        // Lambda expression
        DataProcessor processor1 = (input) -> {
            return input != null ? input.trim() : "";
        };
        
        // Method reference to annotated static method
        DataProcessor processor2 = DataService::toUpperCase;
        
        // Method reference to String method
        DataProcessor processor3 = String::toLowerCase;
        
        System.out.println(processor1.process("  Hello World  "));
        System.out.println(processor2.process("hello world"));
        System.out.println(processor3.process("HELLO WORLD"));
    }
}