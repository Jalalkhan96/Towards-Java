// Bubble sort - sort an array by repeatedly swapping adjacent elements
// that are out of order.
// e.g. {64, 34, 25, 12, 22, 11, 90} -> {11, 12, 22, 25, 34, 64, 90}
//      {1, 2, 3, 4, 5} stays {1, 2, 3, 4, 5} (already sorted)

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] unsorted = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(unsorted);
        printArray(unsorted);

        int[] sorted = {1, 2, 3, 4, 5};
        bubbleSort(sorted);
        printArray(sorted);

        int[] single = {7};
        bubbleSort(single);
        printArray(single);
    }
}
