/*Basic Predefined Annotations

**Task:** Create a class with methods that demonstrate the use of `@Override`, `@Deprecated`, and `@SuppressWarnings` annotations. */

class Vehicle {
    public void start() {
        System.out.println("Vehicle starting...");
    }
    
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting with key...");
    }
    
    public void useDeprecatedMethod() {
        oldMethod(); // This would normally show a warning
    }
}