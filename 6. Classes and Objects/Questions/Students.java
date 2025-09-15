/* Basic Class Declaration and Member Variables

**Question:** Create a class called `Student` with the following member variables:

- `name` (String)
- `age` (int)
- `grade` (char)

Make all variables public for now.*/

public class Students {
    public String name;
    public int age;
    public char grade;

/*Simple Constructor

**Question:** Add a constructor to the `Student` class that takes three parameters (name, age, grade) and initializes all member variables. */

public Students(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

/*Creating and Using Objects

**Question:** Create a `main` method that creates two `Student` objects and prints their information. */

    public static void main(String[] args) {
        Students student1 = new Students("Andrew", 20, 'A');
        Students student2 = new Students("Brenda", 19, 'B');
        
        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", Grade: " + student1.grade);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age + ", Grade: " + student2.grade);
    }
}

