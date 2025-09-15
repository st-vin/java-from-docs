/* Basic Class Declaration and Member Variables

**Question:** Create a class called `Student` with the following member variables:

- `name` (String)
- `age` (int)
- `grade` (char)

Make all variables public for now.

Methods with Return Values

**Question:** Add the following methods to your `Student` class:

- `getFullInfo()` - returns a String with all student information
- `isAdult()` - returns true if age >= 18
- `getGradePoint()` - converts letter grade to numeric (A=4, B=3, C=2, D=1, F=0) */

public class StudentMethods {
    public String name;
    public int age;
    public char grade;

    public StudentMethods(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getFullInfo() {
            return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public int getGradePoint() {
        switch(grade) {
            case 'A': return 4;
            case 'B': return 3;
            case 'C': return 2;
            case 'D': return 1;
            case 'F': return 0;
            default: return 0;
        }
    }

        public static void main(String[] args) {
        StudentMethods student1 = new StudentMethods("Andrew", 20, 'A');
        System.out.println(student1.getFullInfo());
        System.out.println(student1.isAdult());
        System.out.println(student1.getGradePoint());
        }
}