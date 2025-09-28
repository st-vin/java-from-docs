/*9: Nested Class with Annotations

**Task:** Create a class with a nested enum that uses annotations. The outer class should have a method that uses both custom annotations and predefined ones. */

@interface Status {
    String value();
}

@interface Priority {
    Level level();
    String note() default "";
}

class TaskManager {
    
    enum Level {
        @Status("Critical - Immediate attention required")
        URGENT,
        
        @Status("Important - Handle today") 
        HIGH,
        
        @Status("Normal - Handle when possible")
        MEDIUM,
        
        @Status("Optional - Low priority")
        LOW
    }
    
    @Priority(level = Level.URGENT, note = "System failure")
    @Deprecated
    @SuppressWarnings("unused")
    public void handleCriticalTask() {
        System.out.println("Handling critical system task");
    }
    
    @Priority(level = Level.MEDIUM)
    public void handleRoutineTask() {
        System.out.println("Handling routine task");
    }
}