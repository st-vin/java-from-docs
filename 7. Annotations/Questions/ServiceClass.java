/*4: Multiple Annotations on Same Element

**Task:** Create two annotations `@Tested` (no elements) and `@Performance` (with `rating()` element). Apply both to the same method. */

@interface Tested {
    // no elements
}

@interface Perfomance {
    String rating();
}

class ServiceClass {
    @Tested
    @Perfomance(rating = "High")
    public void processData() {
        System.out.println("Processing Important Data...");
    }
}