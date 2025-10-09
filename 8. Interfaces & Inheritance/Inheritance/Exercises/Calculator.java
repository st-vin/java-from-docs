/*Method Hiding with Static (Medium)**

**Concept:** Hiding static methods vs. overriding instance methods

Create a `MathUtils` class with a static method `calculate()` that returns 10.

Create a `AdvancedMathUtils` subclass with its own static `calculate()` method that returns 20.

Create references of both types pointing to `AdvancedMathUtils` objects and observe the behavior. */

class MathUtils {
    public static int calculate() {
        return 10;
    }

    public int instanceMethod() {
        return 100;
    }
}

class AdvancedMathUtils  extends MathUtils {

    public static int calculate() {
        return 20;
    }

    // This OVERRIDES the parent's instance method
    @Override
    public int instanceMethod() {
        return 200;
    }
}

public class Calculator {
    public static void main(String[] args) {
        MathUtils obj1 = new AdvancedMathUtils();
        AdvancedMathUtils obj2 = new AdvancedMathUtils();

        // Static method - determined by REFERENCE type
        System.out.println(obj1.calculate());  // 10 (uses MathUtils version)
        System.out.println(obj2.calculate());  // 20 (uses AdvancedMathUtils version)

        // Instance method - determined by OBJECT type (polymorphism)
        System.out.println(obj1.instanceMethod());  // 200 (uses AdvancedMathUtils version)
        System.out.println(obj2.instanceMethod());  // 200 (uses AdvancedMathUtils version)
        
        // Best practice: call static methods using class name
        System.out.println(MathUtils.calculate());          // 10
        System.out.println(AdvancedMathUtils.calculate());  // 20
    }
}

/*- Static methods are **hidden**, not **overridden**
- For static methods, which version executes is determined by the **reference type** at compile-time, not the object type
- For instance methods, which version executes is determined by the **object type** at runtime (polymorphism)
- Static methods don't participate in polymorphism because they belong to the class, not to instances
- **Best practice:** Always call static methods using the class name, not object references */