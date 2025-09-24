/*Enum Types (Medium)

**Concept: Enum Types**

Create an enum for days of the week with methods and use it in a scheduling application.
 */

 // Enum with methods
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
    
    public int getWorkHours() {
        return isWeekend() ? 0 : 8;
    }
}

public class WeekScheduler {
    
    public static void printSchedule() {
        // Iterate through all enum values
        for (Day day : Day.values()) {
            System.out.println("Day: " + day + 
                             ", Weekend: " + day.isWeekend() + 
                             ", Work Hours: " + day.getWorkHours());
        }
    }
    
    public static void main(String[] args) {
        printSchedule();
        
        // Additional enum usage examples:
        Day today = Day.FRIDAY;
        System.out.println("\nToday is " + today);
        System.out.println("Is it weekend? " + today.isWeekend());
        
        // Using enum in switch
        switch (today) {
            case MONDAY:
                System.out.println("Start of work week!");
                break;
            case FRIDAY:
                System.out.println("TGIF!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend time!");
                break;
            default:
                System.out.println("Regular work day");
        }
    }
}