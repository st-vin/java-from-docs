
/*Basic Enum Types

**Question:** Create an enum `Day` with all days of the week.

Add a method `isWeekend()` that returns true for Saturday and Sunday. */

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public static void main(String[] args) {
            for (Day day : Day.values()) {
                System.out.println(day + " is weekend: " + day.isWeekend());
            }

            Day today = Day.FRIDAY;
            System.out.println("Today is " + today + ", weekend: " + today.isWeekend());
        }
    }
