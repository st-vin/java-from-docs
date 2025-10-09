/* Using super Keyword (Easy)**

**Concept:** Using `super` to access superclass methods

Modify Exercise 1 so that the `Car` class's `start()` method

first calls the superclass's `start()` method using `super`,

then prints "Car-specific systems activated". */

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        super.start();  // Call superclass method
        System.out.println("Car-specific systems activated");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        // Output:
        // Vehicle is starting
        // Car-specific systems activated
    }
}

/*- `super.start()` calls the `Vehicle` class's `start()` method
- This allows you to extend functionality rather than completely replace it
- The `super` keyword is used to reference the immediate parent class
- This is a common pattern when you want to add behavior while preserving the parent's behavior */