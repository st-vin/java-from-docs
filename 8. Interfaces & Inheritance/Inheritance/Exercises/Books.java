/*Object Class Methods (Medium)**

**Concept:** Object as a superclass, overriding `toString()` and `equals()`

Create a `Book` class with `title` and `author` fields.

Override `toString()` to return a formatted string and `equals()` to compare books based on title and author. */

class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\" " + title + "\" by " + author;
    }

    @Override
    public boolean equals(Object obj) {
        // check if same reference
        if (this == obj) {
            return true;
        }

        // check if obj is null or different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // cast and compare fields
        Book other = (Book) obj;
        return this.title.equals(other.title) && this.author.equals(other.author);
    }
}

public class Books {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Animal Farm", "George Orwell");
        
        // toString() is called automatically by println
        System.out.println(b1);  // "1984" by George Orwell
        
        // equals() comparison
        System.out.println(b1.equals(b2));  // true (same content)
        System.out.println(b1 == b2);       // false (different objects)
        System.out.println(b1.equals(b3));  // false (different title)
    }
}

/*- Every class in Java implicitly extends `Object` if no other superclass is specified
- `Object` provides several methods including `toString()`, `equals()`, and `hashCode()`
- Default `toString()` returns classname@hashcode, which isn't very useful
- Default `equals()` compares references (same as `==`), not content
- When overriding `equals()`, follow this pattern:
    1. Check reference equality (`this == obj`)
    2. Check for null and class compatibility
    3. Cast and compare fields
- `@Override` helps catch errors if you misspell or use wrong parameters */