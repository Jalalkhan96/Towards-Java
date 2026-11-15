// Binary search - find a target in a SORTED array by repeatedly halving
// the search range. Returns the index of the target, or -1 if absent.
// e.g. search 23 in {2, 5, 8, 12, 16, 23, 38, 56, 72, 91} -> index 5
//      search 7 in the same array -> -1 (not found)

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sorted = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int[] targets = {23, 7, 2, 91, 50};
        for (int target : targets) {
            int index = binarySearch(sorted, target);
            if (index == -1) {
                System.out.println(target + " not found");
            } else {
                System.out.println(target + " found at index " + index);
            }
        }

        int[] empty = {};
        System.out.println("search in empty array: " + binarySearch(empty, 1));
    }
}
