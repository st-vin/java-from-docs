/*Basic Inheritance (Easy)**

**Concept:** Inheritance, method overriding

Create a `Vehicle` class with a `start()` method that prints "Vehicle is starting".

Then create a `Car` class that extends `Vehicle` and overrides the `start()` method to print "Car engine is starting".

Create objects of both classes and call their `start()` methods. */

class Vehicle {

    public void start() {
        System.out.println("Vehicle is Starting...");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car engine is starting...");
    }
}

class MethodOverride {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();
    }
}