// ReverseArray.java - Reverse the elements of an array in place.
public class ReverseArray {

    // Reverses the given array in place using two pointers.
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        printArray(numbers);

        reverse(numbers);
        System.out.print("Reversed array: ");
        printArray(numbers);

        int[] single = {42};
        reverse(single);
        System.out.print("Single element reversed: ");
        printArray(single);

        int[] even = {10, 20, 30, 40};
        reverse(even);
        System.out.print("Even length reversed: ");
        printArray(even);
    }
}
