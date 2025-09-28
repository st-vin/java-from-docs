/*3: Annotation with Default Values

**Task:** Create an annotation called `@Version` with two elements:

- `number()` - required, represents version number as String
- `date()` - optional with default value "Unknown" */

@interface Version {
    String number();
    String date() default "Unknown";
}

// Usage example
@Version(number = "1.0")
class BasicApp {
    // app logic
}

@Version(number = "2.2", date = "2025-09-24")
class AdvancedApp {
    // app logic
}