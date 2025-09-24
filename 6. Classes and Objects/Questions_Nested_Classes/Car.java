/*Basic Static Nested Class (Easy)

**Concept: Nested Classes**

Create a `Car` class with a static nested class `Engine`.
The `Engine` class should have a method to display engine information.*/

public class Car {
    private String model;
    
    public Car(String model) {
        this.model = model;
    }
    
    // Static nested class
    static class Engine {
        private String type;
        
        public Engine(String type) {
            this.type = type;
        }
        
        public void displayInfo() {
            System.out.println("Engine Type: " + type);
        }
    }
    
    public static void main(String[] args) {
        // Create nested class instance without outer class instance
        Car.Engine engine = new Car.Engine("V6");
        engine.displayInfo();
        
        Car car = new Car("Toyota");
        // Can still create engine separately
        Car.Engine anotherEngine = new Car.Engine("V8");
        anotherEngine.displayInfo();
    }
}