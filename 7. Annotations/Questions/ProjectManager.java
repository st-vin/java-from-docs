/*5: Annotation with Enum Values

**Task:** Create an enum `Priority` with values LOW, MEDIUM, HIGH. Then create an annotation `@Task` that uses this enum as an element type. */

enum Priority {
    LOW, MEDIUM, HIGH
}

@interface Task {
    Priority priority();
    String description();
}

class ProjectManager {
    @Task(priority = Priority.HIGH, description = "Fix critical bug")
    public void urgentFix() {
        System.out.println("Working on urgent fix...");
    }
    
    @Task(priority = Priority.LOW, description = "Update documentation")
    public void updateDocs() {
        System.out.println("Updating documentation...");
    }
}