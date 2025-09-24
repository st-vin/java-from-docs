/*Field Initialization

**Question:** Create a `Student` class demonstrating different field initialization methods:

- A static field `schoolName` initialized with a value
- An instance field `name` initialized in the declaration
- An instance field `id` initialized in a constructor
- An instance field `grades` initialized in an instance initializer block
- A static initializer block that prints "School system initialized" */
import java.util.ArrayList;
import java.util.List;

public class Student {
    private static String schoolName = "Wealth Academy";
    private String name = "Unknown Student";
    private int id;
    private List<Integer> grades;

    // static initializer block
    static {
        System.out.println("School system initialized");
        System.out.println("School name set to: " + schoolName);
    }

    // Instance initalizer block
    {
        grades = new ArrayList<>();
        System.out.println("Student instance created");
    }

    public Student(int id) {
        this.id = id;
    }

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grades=" + grades + "}";
    }

    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2, "Alice");
        s1.addGrade(85);
        s2.addGrade(92);
        
        System.out.println(s1);
        System.out.println(s2.toString());
        System.out.println(Student.schoolName = "Beethoven");
    }
}