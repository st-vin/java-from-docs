/*Static Fields and Methods

**Question:** Create a `Counter` class with:

- A static field `totalCount` initialized to 0
- An instance field `instanceCount` initialized to 0
- A constructor that increments both counters
- A static method `getTotalCount()` that returns the total count
- An instance method `getInstanceCount()` that returns the instance count */

public class Counter {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public Counter() {
        totalCount++;
        instanceCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void incrementInstance() {
        instanceCount++;
        totalCount++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        // c1.incrementInstance();

        System.out.println("Total count: " + Counter.getTotalCount()); // Output: 3
        System.out.println("C1 instance count: " + c1.getInstanceCount()); // Output: 2
        System.out.println("C2 instance count: " + c2.getInstanceCount()); // Output: 1
    }
}