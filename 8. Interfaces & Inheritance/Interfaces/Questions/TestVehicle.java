/*6: Default Methods (Medium)

**Concept**: Default Methods in Interfaces

Add a default method `getInfo()` to the `Vehicle` interface that returns a String with basic vehicle information.

Then test it with the `Car` class */

interface Vehicle {
    void start();
    void stop();
    int getMaxSpeed();

    // default method with implementation
    default String getInfo() {
        return "Max Speed: " + getMaxSpeed() + "kmh";
    }
}

class Car implements Vehicle {
    public int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void start() {
        System.out.println("Car is Starting...");
    }

    public void stop() {
        System.out.println("Car is Stopping...");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}

public class TestVehicle {
    public static void main(String[] args) {
        Car Ford = new Car(200);

        Ford.start();
        System.out.println(Ford.getInfo()); // uses default implementation

        Ford.stop();
    }
}