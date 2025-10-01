/*Interface with Multiple Methods (Medium)

**Concept**: Interfaces with multiple method declarations

Create an interface `Vehicle` with three methods:

- `start()` - returns void
- `stop()` - returns void
- `getMaxSpeed()` - returns int

Then create a `Car` class that implements this interface. */

interface Vehicle {
    void start();
    void stop();
    int getMaxSpeed();
}

public class Car implements Vehicle {
private boolean isRunning;
    private int maxSpeed;
    
    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.isRunning = false;
    }
    
    @Override
    public void start() {
        isRunning = true;
        System.out.println("Car engine started");
    }
    
    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Car engine stopped");
    }
    
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static void main(String[] args) {
        Car Tiguan = new Car(180);
        Car Forester = new Car(200);

        Tiguan.start();
        Forester.getMaxSpeed();
    }
}