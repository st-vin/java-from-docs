/*Complex Inheritance Hierarchy (Hard)**

**Concept:** Multi-level inheritance, abstract classes, method overriding, super keyword, polymorphism

Create an abstract class `Employee` with fields `name` and `baseSalary`, an abstract method `calculatePay()`, and a concrete method `getDetails()`.

Create an abstract class `Manager` that extends `Employee` and adds a `bonus` field. Create concrete classes `SoftwareEngineer` (extends `Employee`)

and `EngineeringManager` (extends `Manager`).

Implement `calculatePay()` appropriately in each concrete class.

Create a method that processes an array of `Employee` objects polymorphically*/

abstract class Employee {
    protected String name;
    protected double baseSalary;
    
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public abstract double calculatePay();
    
    public String getDetails() {
        return name + " - Pay: $" + calculatePay();
    }
}

abstract class Manager extends Employee {
    protected double bonus;
    
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);  // Call parent constructor
        this.bonus = bonus;
    }
}

class SoftwareEngineer extends Employee {
    private int projectsCompleted;
    
    public SoftwareEngineer(String name, double baseSalary, int projectsCompleted) {
        super(name, baseSalary);
        this.projectsCompleted = projectsCompleted;
    }
    
    @Override
    public double calculatePay() {
        // Base salary + $500 per project
        return baseSalary + (projectsCompleted * 500);
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + " (Projects: " + projectsCompleted + ")";
    }
}

class EngineeringManager extends Manager {
    private int teamSize;
    
    public EngineeringManager(String name, double baseSalary, double bonus, int teamSize) {
        super(name, baseSalary, bonus);
        this.teamSize = teamSize;
    }
    
    @Override
    public double calculatePay() {
        // Base salary + bonus + $200 per team member
        return baseSalary + bonus + (teamSize * 200);
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + " (Team: " + teamSize + ")";
    }
}

public class GrossPayRoll {
    // Polymorphic method - works with any Employee
    public static void processPayroll(Employee[] employees) {
        double totalPayroll = 0;
        System.out.println("=== PAYROLL REPORT ===");
        for (Employee emp : employees) {
            System.out.println(emp.getDetails());
            totalPayroll += emp.calculatePay();
        }
        System.out.println("Total Payroll: $" + totalPayroll);
    }
    
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SoftwareEngineer("Alicia", 80000, 5);
        employees[1] = new SoftwareEngineer("Brandon", 95000, 8);
        employees[2] = new EngineeringManager("Clarence", 100000, 20000, 8);
        
        processPayroll(employees);
    }
}

/*- **Multi-level inheritance:** `EngineeringManager` → `Manager` → `Employee`
- Both `Employee` and `Manager` are abstract, creating a hierarchy of increasing specialization
- **Protected fields** (`name`, `baseSalary`, `bonus`) are accessible to subclasses
- `super(...)` calls the parent constructor - must be first statement in constructor
- Each concrete class implements `calculatePay()` differently based on its role
- `getDetails()` is overridden to add more information, using `super.getDetails()` to build upon parent behavior
- **Polymorphism in action:** The `processPayroll()` method works with `Employee[]` but processes different types correctly at runtime
- This demonstrates real-world object-oriented design: abstract base classes define structure, concrete classes provide specific implementations
- The system is extensible: you could add more employee types without changing existing code */