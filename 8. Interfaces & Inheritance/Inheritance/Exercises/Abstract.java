/*Abstract Classes and Methods (Medium)**

**Concept:** Abstract classes, abstract methods

Create an abstract class `Animal` with an abstract method `makeSound()` 

and a concrete method `sleep()` that prints "Zzz...".

Create two concrete subclasses `Dog` and `Cat` that implement `makeSound()`.

Try to instantiate `Animal` directly and observe what happens. */

abstract class Animal {
    // Abstract method - no implementation
    public abstract void makeSound();
    
    // Concrete method - has implementation
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Animal a = new Animal();  // COMPILE ERROR: Cannot instantiate abstract class
        
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.makeSound();  // Woof! Woof!
        dog.sleep();      // Zzz...
        
        cat.makeSound();  // Meow!
        cat.sleep();      // Zzz...
    }
}

/*
- **Abstract classes** cannot be instantiated directly - they're incomplete and require subclasses to complete them
- **Abstract methods** have no body (no implementation) - subclasses MUST provide the implementation
- Abstract classes can have both abstract methods and concrete methods
- Any class with at least one abstract method must be declared abstract
- Subclasses must implement ALL abstract methods or be declared abstract themselves
- You can use abstract class references to achieve polymorphism, even though you can't instantiate the abstract class */