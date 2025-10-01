/*Using Interface as a Type (Medium)

**Concept**: Using an Interface as a Type

Modify the main method from Exercise 3 to use the `Drawable` interface as the reference type instead of the concrete class types.

Store all shapes in an array of `Drawable` and iterate through them. */

interface Drawable {
    void draw();
}

public class InterfaceType {
    public static void main(String[] args) {
        // Using interface as reference type
        Drawable[] shapes = {
            
            new Rectangle(), 
            new Triangle(),
        };
        
        // Iterate through array and call draw() on each
        for (Drawable shape : shapes) {
            shape.draw();
        }
        
        // Alternative approach
        Drawable shape1 = new Triangle();
        Drawable shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
    }
}