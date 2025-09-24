/*Simple Local Class (Easy-Medium)

**Concept: Local Classes**

Create a method that uses a local class to validate and format phone numbers. */

public class PhoneValidator {
    
    public String formatPhoneNumber(String phoneNumber) {
        // Local class defined inside method
        class PhoneFormatter {
            private String number;
            
            public PhoneFormatter(String number) {
                this.number = number;
            }
            
            public boolean isValid() {
                // Can access the method parameter phoneNumber
                return phoneNumber != null && 
                       phoneNumber.replaceAll("[^0-9]", "").length() == 10;
            }
            
            public String format() {
                if (isValid()) {
                    String digits = number.replaceAll("[^0-9]", "");
                    return "(" + digits.substring(0, 3) + ") " + 
                           digits.substring(3, 6) + "-" + 
                           digits.substring(6, 10);
                }
                return "Invalid";
            }
        }
        
        // Use the local class
        PhoneFormatter formatter = new PhoneFormatter(phoneNumber);
        return formatter.format();
    }
    
    public static void main(String[] args) {
        PhoneValidator validator = new PhoneValidator();
        System.out.println(validator.formatPhoneNumber("1234567890")); // (123) 456-7890
        System.out.println(validator.formatPhoneNumber("12345")); // Invalid
    }
}