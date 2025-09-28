/*Simple Custom Annotation

**Task:** Create a basic annotation called `@Author` that can store the author's name as a string.
 */

@interface Author {
    String name();
}

// Usage 
@Author(name = "Frank Herbert")
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}