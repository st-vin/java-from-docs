/*6: Repeating Annotations

**Task:** Create a repeating annotation `@Schedule` that can specify multiple time slots. Each schedule should have `day()` and `time()` elements. */

import java.lang.annotation.Repeatable;

@Repeatable
@interface Schedule {
    String day();
    String time();
}

@interface Schedules {
    Schedule[] value();
}

// Usage:

class MeetingRoom {
    @Schedule(day = "Monday", time = "9:00 AM")
    @Schedule(day = "Wednesday", time = "2:00 PM")
    @Schedule(day = "Friday", time = "10:30 AM")
    public void weeklyMeeting() {
        System.out.println("Regular team meeting");
    }

}