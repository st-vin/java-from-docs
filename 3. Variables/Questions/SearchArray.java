public class SearchArray {
    public static boolean contains(int[] arr, int target) {
        for (int number : arr) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        if (contains(numbers, target)) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}
