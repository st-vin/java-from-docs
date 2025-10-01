/*Multiple Interface Implementation (Hard)

**Concept**: A class implementing multiple interfaces

Create interfaces `Drivable` with method `drive()` and `Flyable` with method `fly()`.

Then create a `FlyingCar` class that implements both interfaces as well as having basic car functionality. */

interface Drivable {
    void drive();
    
    default String getDriveMode() {
        return "Ground driving mode";
    }
}

interface Flyable {
    void fly();
    
    default String getFlightMode() {
        return "Air flight mode";
    }
}

class FlyingCar implements Drivable, Flyable {
    private String model;
    private boolean isFlying;
    private boolean isDriving;
    
    public FlyingCar(String model) {
        this.model = model;
        this.isFlying = false;
        this.isDriving = false;
    }
    
    @Override
    public void drive() {
        isDriving = true;
        isFlying = false;
        System.out.println(model + " is now driving on the road");
    }
    
    @Override
    public void fly() {
        isFlying = true;
        isDriving = false;
        System.out.println(model + " is now flying in the air");
    }
    
    public void switchMode() {
        if (isDriving) {
            System.out.println("Switching from drive to fly mode");
            fly();
        } else if (isFlying) {
            System.out.println("Switching from fly to drive mode");
            drive();
        } else {
            System.out.println("Vehicle is stopped. Choose drive or fly mode.");
        }
    }
    
    public void showCurrentMode() {
        if (isDriving) {
            System.out.println(getDriveMode());
        } else if (isFlying) {
            System.out.println(getFlightMode());
        } else {
            System.out.println("Vehicle is stopped");
        }
    }
}

public class FlyingCarTest {
    public static void main(String[] args) {
        FlyingCar futurecar = new FlyingCar("SkyRider 3000");
        
        futurecar.drive();
        futurecar.showCurrentMode();
        
        futurecar.switchMode();
        futurecar.showCurrentMode();
        
        // Using as different interface types
        Drivable groundVehicle = futurecar;
        Flyable airVehicle = futurecar;
        
        groundVehicle.drive();
        airVehicle.fly();
    }
}