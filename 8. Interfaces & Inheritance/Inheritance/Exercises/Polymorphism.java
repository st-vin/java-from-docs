/*Polymorphism Basics (Medium)**

**Concept:** Polymorphism, dynamic method dispatch

Create a `Shape` class with a method `draw()`.

Create three subclasses: `Circle`, `Rectangle`, and `Triangle`, each overriding `draw()` with their own implementation.

Create an array of `Shape` references holding different shape objects and call `draw()` on each. */

class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

/*- **Polymorphism** allows objects of different classes to be treated as objects of a common superclass
- The array is of type `Shape[]`, but holds `Circle`, `Rectangle`, and `Triangle` objects
- When `shape.draw()` is called, Java determines at **runtime** which version of `draw()` to execute based on the actual object type (not the reference type)
- This is called **dynamic method dispatch** or **runtime polymorphism**
- This is one of the most powerful features of OOP - write code once that works with many types */