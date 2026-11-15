// Linear search - scan an array from the start and return the index of the
// first element equal to the target, or -1 if the target is not present.
// e.g. search 22 in {5, 12, 22, 34, 41} -> index 2
//      search 99 in {5, 12, 22, 34, 41} -> -1 (not found)

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 22, 34, 41};
        int[] targets = {22, 99, 5, 41};
        for (int target : targets) {
            int index = linearSearch(numbers, target);
            if (index == -1) {
                System.out.println(target + " not found");
            } else {
                System.out.println(target + " found at index " + index);
            }
        }

        int[] empty = {};
        System.out.println("search in empty array: " + linearSearch(empty, 1));
    }
}
