// StudentManager.java

public class StudentManager {
    private Student[] students;
    private int studentCount;
    
    public StudentManager(int capacity) {
        this.students = new Student[capacity];
        this.studentCount = 0;
    }
    
    public boolean addStudent(Student student) {
        if (this.studentCount < this.students.length) {
            this.students[this.studentCount] = student;
            this.studentCount++;
            System.out.println("Added student: " + student.getFullName());
            return true;
        } else {
            System.out.println("Cannot add student. Management system is at capacity.");
            return false;
        }
    }
    
    public Student findStudentById(int studentId) {
        for (int i = 0; i < this.studentCount; i++) {
            if (this.students[i].getStudentId() == studentId) {
                return this.students[i];
            }
        }
        return null;
    }
    
    public void displayAllStudents() {
        System.out.println("\n=== All Students ===");
        for (int i = 0; i < this.studentCount; i++) {
            System.out.println(this.students[i]);
            System.out.println("-------------------");
        }
        System.out.println("Total students managed: " + this.studentCount);
    }
    
    public double calculateAverageGpa() {
        if (this.studentCount == 0) return 0.0;
        
        double totalGpa = 0.0;
        for (int i = 0; i < this.studentCount; i++) {
            totalGpa += this.students[i].getGpa();
        }
        return totalGpa / this.studentCount;
    }
    
    public static void main(String[] args) {
        // Create a student management system
        StudentManager manager = new StudentManager(5);
        
        // Create students using different constructors
        Student student1 = new Student("John", "Doe", 20, 3.5, "Computer Science");
        Student student2 = new Student("Jane", "Smith", 19, "Mathematics");
        Student student3 = new Student("Bob", "Johnson", 21, 2.8, "Physics");
        
        // Add students to manager
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        
        // Update a student's GPA
        student2.updateGpa(3.8);
        
        // Display all students
        manager.displayAllStudents();
        
        // Display statistics
        System.out.println("\n=== Statistics ===");
        Student.displayStatistics();
        System.out.println("Average GPA: " + String.format("%.2f", manager.calculateAverageGpa()));
        
        // Find a specific student
        Student found = manager.findStudentById(2);
        if (found != null) {
            System.out.println("\nFound student: " + found.getFullName());
        }
    }
}
