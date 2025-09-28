/*Complex Annotation with Multiple Element Types

**Task:** Create an annotation `@APIEndpoint` with the following elements:

- `path()` - String, required
- `methods()` - array of strings, default to {"GET"}
- `version()` - int, default to 1
- `deprecated()` - boolean, default to false */

@interface APIEndpoint {
    String path();
    String[] methods() default {"GET"};
    int version() default 1;
    boolean deprecated() default false;
}

class RestController {
    @APIEndpoint(path = "/users")
    public void getUsers() {
        // Uses all defaults: GET method, version 1, not deprecated
        System.out.println("Retrieving users...");
    }
    
    @APIEndpoint(
        path = "/users", 
        methods = {"POST", "PUT"}, 
        version = 2
    )
    public void modifyUsers() {
        System.out.println("Modifying users...");
    }
    
    @APIEndpoint(
        path = "/legacy-data",
        methods = {"GET", "POST"},
        version = 1,
        deprecated = true
    )
    public void legacyEndpoint() {
        System.out.println("Legacy endpoint - please migrate!");
    }
}