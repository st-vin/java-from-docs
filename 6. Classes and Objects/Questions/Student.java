// Student.java
public class Student {
    private static int totalStudents = 0;
    private static int nextId = 1;
    
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    
    // Constructor with all fields
    public Student(String firstName, String lastName, int age, double gpa, String major) {
        this.studentId = nextId++;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setGpa(gpa);
        this.setMajor(major);
        totalStudents++;
    }
    
    // Constructor without GPA (defaults to 0.0)
    public Student(String firstName, String lastName, int age, String major) {
        this(firstName, lastName, age, 0.0, major);
    }
    
    // Static methods
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    public static void displayStatistics() {
        System.out.println("Total students created: " + totalStudents);
        System.out.println("Next student ID: " + nextId);
    }
    
    // Instance methods
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    
    public void updateGpa(double newGpa) {
        if (this.isValidGpa(newGpa)) {
            double oldGpa = this.gpa;
            this.gpa = newGpa;
            System.out.println("GPA updated for " + this.getFullName() + 
                             " from " + oldGpa + " to " + newGpa);
        }
    }
    
    public String getAcademicStanding() {
        if (this.gpa >= 3.5) return "Dean's List";
        else if (this.gpa >= 3.0) return "Good Standing";
        else if (this.gpa >= 2.0) return "Academic Warning";
        else return "Academic Probation";
    }
    
    private boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }
    
    @Override
    public String toString() {
        return "Student ID: " + this.studentId + "\n" +
               "Name: " + this.getFullName() + "\n" +
               "Age: " + this.age + "\n" +
               "Major: " + this.major + "\n" +
               "GPA: " + String.format("%.2f", this.gpa) + "\n" +
               "Academic Standing: " + this.getAcademicStanding();
    }
    
    // Getters and Setters
    public int getStudentId() { return this.studentId; }
    
    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName.trim();
        }
    }
    
    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName.trim();
        }
    }
    
    public int getAge() { return this.age; }
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
    
    public double getGpa() { return this.gpa; }
    public void setGpa(double gpa) {
        if (this.isValidGpa(gpa)) {
            this.gpa = gpa;
        }
    }
    
    public String getMajor() { return this.major; }
    public void setMajor(String major) {
        if (major != null && !major.trim().isEmpty()) {
            this.major = major.trim();
        }
    }
}