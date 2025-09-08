public class ConcatenateArray {
    public static String concatenateStrings(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
            if (i < strings.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Peter"};
        String combinedName = concatenateStrings(names);
        System.out.println("Combined name: " + combinedName);
    }
}
