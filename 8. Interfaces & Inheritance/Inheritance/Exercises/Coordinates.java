/*Final Variables and Inheritance (Hard)**

**Concept:** Final instance variables, initialization in constructors, final method parameters

Create a class `ImmutablePoint` with final `x` and `y` coordinates.

Create a subclass `NamedPoint` that adds a final `name` field.

Demonstrate that final fields must be initialized in constructors and cannot be modified afterward. */

class ImmutablePoint {
    private final int x;
    private final int y;
    
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        // Final fields must be initialized in constructor or at declaration
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
    
    // Method with final parameter
    public double distanceTo(final ImmutablePoint other) {
        // other = new ImmutablePoint(0, 0);  // COMPILE ERROR: cannot assign to final parameter
        
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class NamedPoint extends ImmutablePoint {
    private final String name;
    
    public NamedPoint(int x, int y, String name) {
        super(x, y);  // Initialize parent's final fields
        this.name = name;  // Initialize own final field
        // this.name = "changed";  // COMPILE ERROR: final field already assigned
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void display() {
        System.out.println(name + ": Point(" + getX() + ", " + getY() + ")");
    }
}

public class Coordinates {
    public static void main(String[] args) {
        ImmutablePoint p1 = new ImmutablePoint(3, 4);
        NamedPoint p2 = new NamedPoint(0, 0, "Origin");
        
        p1.display();  // Point(3, 4)
        p2.display();  // Origin: Point(0, 0)
        
        // p1.x = 10;  // COMPILE ERROR: x is final and private
        
        double distance = p1.distanceTo(p2);
        System.out.println("Distance: " + distance);  // Distance: 5.0
        
        // Demonstrating immutability
        NamedPoint p3 = new NamedPoint(5, 5, "Corner");
        System.out.println("Before: " + p3.getName());  // Corner
        // p3.name = "Changed";  // COMPILE ERROR: name is final
        System.out.println("After: " + p3.getName());   // Still Corner
    }
}

/*- **Final instance variables** must be initialized either:
    - At declaration: `private final int x = 0;`
    - In every constructor (shown in example)
- Once initialized, final fields cannot be reassigned
- In subclasses, parent's final fields must be initialized via `super()` constructor call
- **Final method parameters** cannot be reassigned within the method body
- Final fields are useful for creating **immutable objects** - objects whose state cannot change after creation
- Immutable objects are thread-safe and easier to reason about
- The `private final` combination is very common for fields that should never change
- Subclasses can add their own final fields and must initialize them in their constructors */