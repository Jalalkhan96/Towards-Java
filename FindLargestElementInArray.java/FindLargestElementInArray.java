// Find the largest element in an array of integers.
// e.g. the largest of {5, 9, 3, 12, 7} is 12; of {-5, -1, -8} is -1.

public class FindLargestElementInArray {

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 12, 7};
        System.out.println("Largest of {5, 9, 3, 12, 7}: " + findLargest(numbers));

        int[] negatives = {-5, -1, -8};
        System.out.println("Largest of {-5, -1, -8}: " + findLargest(negatives));

        int[] single = {42};
        System.out.println("Largest of {42}: " + findLargest(single));
    }
}
