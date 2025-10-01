
/*Multiple Classes Implementing Same Interface (Easy-Medium)

**Concept**: Multiple implementations of the same interface

Create two more classes: `Rectangle` and `Triangle` that also implement the `Drawable` interface.

 Then create a main method that creates objects of all three classes and calls their `draw()` methods. */

interface Drawable {

    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle...");
    }
}
public class MultipleImplementation {
public static void main(String[] args) {
    Triangle triangle = new Triangle();
    Rectangle rectangle = new Rectangle();

    rectangle.draw();
    triangle.draw();
}
}