/*Method References (Medium)

**Concept: Method References**

Create a class with static and instance methods, then use method references to call them. */

interface StringProcessor {
    String process(String input);
}

interface NumberProcessor {
    int process(int input);
}

public class MethodReferenceExample {
    
    // Static method
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
    
    // Instance method
    public String addPrefix(String str) {
        return "PREFIX_" + str;
    }
    
    // Static method for numbers
    public static int square(int num) {
        return num * num;
    }
    
    public static void demonstrateMethodReferences() {
        // 1. Reference to static method
        StringProcessor upperCaseProcessor = MethodReferenceExample::toUpperCase;
        
        // 2. Reference to instance method (need instance)
        MethodReferenceExample instance = new MethodReferenceExample();
        StringProcessor prefixProcessor = instance::addPrefix;
        
        // 3. Reference to instance method of arbitrary object
        StringProcessor lowerCaseProcessor = String::toLowerCase;
        
        // 4. Reference to static method for numbers
        NumberProcessor squareProcessor = MethodReferenceExample::square;
        
        // Test the method references
        System.out.println(upperCaseProcessor.process("hello")); // HELLO
        System.out.println(prefixProcessor.process("world")); // PREFIX_world
        System.out.println(lowerCaseProcessor.process("JAVA")); // java
        System.out.println(squareProcessor.process(5)); // 25
        
        // Equivalent lambda expressions for comparison:
        StringProcessor lambdaUpper = str -> MethodReferenceExample.toUpperCase(str);
        StringProcessor lambdaLower = str -> str.toLowerCase();
        NumberProcessor lambdaSquare = num -> MethodReferenceExample.square(num);
    }
    
    public static void main(String[] args) {
        demonstrateMethodReferences();
    }
}