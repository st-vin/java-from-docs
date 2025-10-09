/*Final Classes and Methods (Medium)**

**Concept:** Final methods, final classes

Create a `SecuritySystem` class with a final method `authenticate()` that must not be overridden.

Then create a final class `EncryptionAlgorithm` that cannot be extended.

Try to violate these constraints and observe the compiler errors. */

class SecuritySystem {
    // final method can't be overridden
    public final boolean authenticate(String password) {
        return password.equals("secure123");
    }

    // non final method - can be overridden
    public void logAccess(String user) {
        System.out.println(user + " accessed the system!");
    }
}

class CustomSecuritySystem extends SecuritySystem {
    // This would cause COMPILE ERROR:
    // @Override
    // public boolean authenticate(String password) {
    //     return true;  // ERROR: Cannot override final method
    // }
    @Override
    public void logAccess(String user) {
        System.out.println("Custom Log: " + user + " Accessed");
    }
}

// Final class - cannot be extended
final class EncryptionAlgorithm {
    public String encrypt(String data) {
        return "encrypted_" + data;
    }
}

// This would cause COMPILE ERROR:
// class BetterEncryption extends EncryptionAlgorithm {
//     // ERROR: Cannot inherit from final class
// }

public class FinalMethods {
    public static void main(String[] args) {
        CustomSecuritySystem css = new CustomSecuritySystem();
        System.out.println(css.authenticate("secure123"));  // true
        css.logAccess("Alice");  // CUSTOM LOG: Alice accessed
        
        EncryptionAlgorithm enc = new EncryptionAlgorithm();
        System.out.println(enc.encrypt("secret"));  // encrypted_secret
    }
}

/*- **Final methods** cannot be overridden by subclasses
- Use final methods when the implementation must not change for security or correctness reasons
- **Final classes** cannot be extended (no subclasses allowed)
- Use final classes when you want to prevent inheritance completely (e.g., `String` is final)
- Final methods enable compiler optimizations (method inlining)
- Making a class final prevents others from extending it, which can be useful for immutable classes or security-sensitive code */