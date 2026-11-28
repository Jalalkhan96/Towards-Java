// FindMinElementInArray.java - Find the smallest element in an array.
public class FindMinElementInArray {

    // Returns the smallest element of a non-empty array.
    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 12, 7};
        System.out.println("Minimum of {5, 9, 3, 12, 7} is " + findMin(numbers));

        int[] negatives = {-5, -1, -8};
        System.out.println("Minimum of {-5, -1, -8} is " + findMin(negatives));

        int[] single = {42};
        System.out.println("Minimum of {42} is " + findMin(single));
    }
}
