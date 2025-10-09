/*Field Hiding (Easy-Medium)**

**Concept:** Hiding fields, accessing hidden fields with `super`

Create a `Parent` class with a field `name = "Parent"` and a method `printName()` that prints `name`.

Create a `Child` class that extends `Parent`, has its own field `name = "Child"`,

and overrides `printName()` to print both the child's name and parent's name using `super.name`. */

class Parent {
    String name = "Parent";

    public void printName() {
        System.out.println("Name: " + name);
    }
}

class Child extends Parent {
    String name = "Child";

    @Override
    public void printName() {
        System.out.println("Parent Name: " + super.name);
        System.out.println("Child Name: " + name);
    }
}

public class FieldHiding {
    public static void main(String[] args) {
        Child child = new Child();
        child.printName();
                System.out.println("Direct access to c.name: " + child.name);  // Child
    }
   
}

/*- The `Child` class's `name` field **hides** (not overrides) the `Parent` class's `name` field
- Field hiding means both fields exist, but the child's field shadows the parent's
- Use `super.name` to access the hidden parent field
- Unlike method overriding, field hiding is based on the reference type, not the object type
- **Important:** Field hiding is generally considered bad practice; use getters/setters instead */