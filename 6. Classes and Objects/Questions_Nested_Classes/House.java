/*Basic Inner Class (Easy)

**Concept: Inner Classes**

Create a `House` class with an inner class `Room`.
The `Room` should be able to access the house's address. */

public class House {
    private String address;
    private int rooms;

    public House(String address, int rooms) {
        this.address = address;
        this.rooms = rooms;
    }

    // Inner class (non static nested class)
    class Room {
        private String name;

        public Room(String name) {
            this.name = name;
        }

        public void displayLocation() {
            // can access outer class's private fields directly
            System.out.println(name + " Is located at " + address);
        }

    }
        public static void main(String[] args) {
            House house = new House("123 Main St", 4);
            House house2 = new House("456 Kilimani", 18);

            // Need outer class instance to create inner class instance
            House.Room livingRoom = house.new Room("Living Room");
            House.Room bedroom = house.new Room("Bedroom");
            House.Room bathroom = house2.new Room("Bathroom");
            House.Room kitchen = house2.new Room("Kitchen");
            House.Room guestroom = house2.new Room("Guestroom");

            livingRoom.displayLocation();
            bedroom.displayLocation();
            bathroom.displayLocation();
            
            kitchen.displayLocation();
            guestroom.displayLocation();
        }

}


