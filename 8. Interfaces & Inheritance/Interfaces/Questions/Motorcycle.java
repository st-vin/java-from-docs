/*Overriding Default Methods (Medium-Hard)

**Concept**: Evolving Interfaces - Overriding default methods

Create a `Motorcycle` class that also implements `Vehicle` but overrides the default `getInfo()` method to provide motorcycle-specific information.*/

interface Vehicle {
    void start();
    void stop();
    int getMaxSpeed();

    // default method with implementation
    default String getInfo() {
        return "Max Speed: " + getMaxSpeed() + "kmh";
    }
}

public class Motorcycle implements Vehicle {
    private boolean isRunning;
    private int maxSpeed;
    private boolean hasSidecar;
    
    public Motorcycle(int maxSpeed, boolean hasSidecar) {
        this.maxSpeed = maxSpeed;
        this.hasSidecar = hasSidecar;
        this.isRunning = false;
    }
    
    @Override
    public void start() {
        isRunning = true;
        System.out.println("Motorcycle engine started - vroom vroom!");
    }
    
    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Motorcycle engine stopped");
    }
    
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    // Override the default method
    @Override
    public String getInfo() {
        String sidecarInfo = hasSidecar ? " with sidecar" : " without sidecar";
        return "This is a motorcycle" + sidecarInfo + " with max speed: " + maxSpeed + " mph";
    }

    public static void main(String[] args) {
        Vehicle motorcycle = new Motorcycle(180, false);
        
        System.out.println(motorcycle.getInfo()); // Uses overridden implementation
    }

}
