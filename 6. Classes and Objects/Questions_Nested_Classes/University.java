/*Complex Nested Structure (Hard)

**Concept: Multiple Nested Classes + Lambdas**

Create a `University` class with nested classes for different components, using lambdas for processing. */

interface GradeProcessor {
    double process(double[] grades);
}

public class University {
    private String name;
    
    public University(String name) {
        this.name = name;
    }
    
    // Static nested class
    static class Department {
        private String name;
        private Course[] courses;
        private int courseCount;
        
        public Department(String name, int maxCourses) {
            this.name = name;
            this.courses = new Course[maxCourses];
            this.courseCount = 0;
        }
        
        // Inner class inside nested class
        class Course {
            private String courseName;
            private double[] grades;
            
            public Course(String courseName, double[] grades) {
                this.courseName = courseName;
                this.grades = grades;
            }
            
            public void displayCourseInfo(GradeProcessor processor) {
                double result = processor.process(grades);
                // Access outer nested class member
                System.out.println(name + " - " + courseName + ": " + result);
            }
            
            public double[] getGrades() {
                return grades;
            }
            
            public String getName() {
                return courseName;
            }
        }
        
        public void addCourse(String courseName, double[] grades) {
            if (courseCount < courses.length) {
                courses[courseCount] = new Course(courseName, grades);
                courseCount++;
            }
        }
        
        public void processAllCourses(GradeProcessor processor, String operation) {
            System.out.println("\n" + operation + " for " + name + ":");
            for (int i = 0; i < courseCount; i++) {
                courses[i].displayCourseInfo(processor);
            }
        }
    }
    
    public static void main(String[] args) {
        University university = new University("Tech University");
        
        // Create department (static nested class doesn't need University instance)
        University.Department csDepartment = new University.Department("Computer Science", 5);
        
        // Add courses with grades
        csDepartment.addCourse("Java Programming", new double[]{85.5, 92.0, 78.5, 89.0, 95.5});
        csDepartment.addCourse("Data Structures", new double[]{88.0, 84.5, 91.0, 87.5, 93.0});
        csDepartment.addCourse("Algorithms", new double[]{76.5, 89.5, 85.0, 92.5, 88.0});
        
        // Lambda expressions for different grade processing operations
        GradeProcessor averageCalculator = grades -> {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.length;
        };
        
        GradeProcessor maxGradeFinder = grades -> {
            double max = grades[0];
            for (double grade : grades) {
                if (grade > max) {
                    max = grade;
                }
            }
            return max;
        };
        
        GradeProcessor minGradeFinder = grades -> {
            double min = grades[0];
            for (double grade : grades) {
                if (grade < min) {
                    min = grade;
                }
            }
            return min;
        };
        
        // Process courses with different operations
        csDepartment.processAllCourses(averageCalculator, "Average Grades");
        csDepartment.processAllCourses(maxGradeFinder, "Maximum Grades");
        csDepartment.processAllCourses(minGradeFinder, "Minimum Grades");
    }
}