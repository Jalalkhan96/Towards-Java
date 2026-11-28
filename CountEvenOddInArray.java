// CountEvenOddInArray.java - Count how many elements of an array are even
// and how many are odd.
public class CountEvenOddInArray {

    // Returns an array {evenCount, oddCount} for the given array.
    public static int[] countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }

    public static void printCounts(int[] arr) {
        int[] counts = countEvenOdd(arr);
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" -> Even: " + counts[0] + ", Odd: " + counts[1]);
    }

    public static void main(String[] args) {
        printCounts(new int[]{1, 2, 3, 4, 5, 6});
        printCounts(new int[]{1, 3, 5});
        printCounts(new int[]{-2, -3, 4, 7, 10});
    }
}
