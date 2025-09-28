/*7: Type Annotations

**Task:** Create a custom annotation `@NonNull` that can be applied to type uses. Use it with method parameters and return types. */

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface NonNull {
    // Marker annotation for type use
}

class UserService {
    public @NonNull String getUserName(@NonNull String userId) {
        if (userId == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }
        return "User_" + userId; // Guaranteed non-null return
    }
    
    public void processUsers(@NonNull String @NonNull [] userList) {
        // Both the array and its elements should be non-null
        for (@NonNull String user : userList) {
            System.out.println("Processing: " + user);
        }
    }
}