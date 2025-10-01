/*Interface Inheritance (Hard)

**Concept**: Interface extending other interfaces

Create a hierarchy where `FlyingVehicle` extends the `Vehicle` interface by adding a `fly()` method.

Then create an `Airplane` class that implements `FlyingVehicle`. */

interface Vehicle {
    void start();
    void stop();
    int getMaxSpeed();
}

interface FlyingVehicle extends Vehicle {
    void fly();

    // add default ethod specific to flying vehicle
    default String getFlightInfo() {
        return "This vehicle can fly.";
    }
}

public class Airplane implements FlyingVehicle {
    private int maxSpeed;
    private int maxAltitude;
    private boolean isFlying;

    public Airplane(int maxSpeed, int maxAltitude) {
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }

    @Override
    public void start() {
        System.out.println("Airplane engine started...");
    }

    @Override
    public void stop() {
        System.out.println("Airplane engines stopped");
    }
    
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    @Override
    public void fly() {
        isFlying = true;
        System.out.println("Airplane is now flying at " + maxAltitude + " feet");
    }
    
    @Override
    public String getFlightInfo() {
        return "This airplane can fly at " + maxAltitude + " feet altitude";
    }
    public static void main(String[] args) {
        Airplane boeing = new Airplane(3000, 5000);
        boeing.start();
        System.out.println(boeing.getMaxSpeed());
        System.out.println(boeing.getFlightInfo());
        boeing.stop();
    }
}
