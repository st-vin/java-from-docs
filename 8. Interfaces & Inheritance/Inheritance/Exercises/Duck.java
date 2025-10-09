interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

public class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    public void swim() {
        System.out.println("Duck is swimming");
    }
public static void main(String[] args) {
    Duck myDuck = new Duck();

    Flyable flyThing = myDuck;
    Swimmable swimmingThing = myDuck;
    
    flyThing.fly();
    swimmingThing.swim();

    myDuck.fly();
    myDuck.swim();

}
}

// // Usage
// Duck myDuck = new Duck();
// Flyable flyingThing = myDuck;  // Duck IS a Flyable
// Swimmable swimmingThing = myDuck;  // Duck IS also a Swimmable
