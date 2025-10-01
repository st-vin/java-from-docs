/*Simple Interface Implementation (Easy)

**Concept**: Implementing an Interface

Create a class `Circle` that implements the `Drawable` interface from Exercise 1.

The `draw()` method should print "Drawing a circle". */

interface Drawable {

    public void draw();
}

public class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw(); 
    } 
}