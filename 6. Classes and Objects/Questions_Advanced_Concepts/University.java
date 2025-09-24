/* Nested Classes

**Question:** Create an outer class `University` with:

- A static nested class `Department` with fields `name` and `head`
- A non-static inner class `Course` with fields `courseName` and `credits`
- Methods to demonstrate accessing outer class members from inner class */

public class University {
    private String universityName;
    private static int totalUniversities = 0;
    
    public University(String name) {
        this.universityName = name;
        totalUniversities++;
    }
    
    // Static nested class
    public static class Department {
        private String name;
        private String head;
        
        public Department(String name, String head) {
            this.name = name;
            this.head = head;
        }
        
        public void displayInfo() {
            System.out.println("Department: " + name + ", Head: " + head);
            System.out.println("Total universities: " + totalUniversities);
            // Cannot access non-static members of outer class directly
        }
        
        public String getName() { return name; }
        public String getHead() { return head; }
    }
    
    // Non-static inner class
    public class Course {
        private String courseName;
        private int credits;
        private Department department;
        
        public Course(String courseName, int credits, Department department) {
            this.courseName = courseName;
            this.credits = credits;
            this.department = department;
        }
        
        public void displayCourseInfo() {
            // Can access outer class members directly
            System.out.println("University: " + universityName);
            System.out.println("Course: " + courseName + " (" + credits + " credits)");
            System.out.println("Department: " + department.getName());
        }
        
        public String getCourseName() { return courseName; }
        public int getCredits() { return credits; }
    }
    
    public String getUniversityName() { return universityName; }
    
    public static void main(String[] args) {
        // Create static nested class instance
        University.Department csDept = new University.Department("Computer Science", "Dr. Smith");
        csDept.displayInfo();
        
        // Create outer class instance
        University uni = new University("Tech University");
        
        // Create inner class instance (requires outer class instance)
        University.Course javaCourse = uni.new Course("Java Programming", 3, csDept);
        javaCourse.displayCourseInfo();
    }
}