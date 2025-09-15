/* Basic Class Declaration and Member Variables

**Question:** Create a class called `Student` with the following member variables:

- `name` (String)
- `age` (int)
- `grade` (char)

Methods with Return Values

**Question:** Add the following methods to your `Student` class:

- `getFullInfo()` - returns a String with all student information
- `isAdult()` - returns true if age >= 18
- `getGradePoint()` - converts letter grade to numeric (A=4, B=3, C=2, D=1, F=0) 

Modify the `Student` class to make all member variables private.
Add appropriate getter and setter methods for each variable.
Include validation in the setters (age must be positive, grade must be A, B, C, D, or F).
*/

public class StudentAccessControl {
    private String name;
    private int age;
    private char grade;

    public StudentAccessControl(String name, int age, char grade) {
        this.setName(name);
        this.setAge(age);
        this.setGrade(grade);
    }
    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    // setters with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
            this.grade = grade;
        }
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
            StudentAccessControl student1 = new StudentAccessControl("Andrew", 20, 'A');
            System.out.println(student1.getFullInfo());
            System.out.println(student1.isAdult());
            System.out.println(student1.getGradePoint());
        }
}