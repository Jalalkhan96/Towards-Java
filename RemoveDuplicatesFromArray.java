// RemoveDuplicatesFromArray.java
// Removes duplicate values from an integer array, keeping the first
// occurrence of each value and the original order of the survivors.

public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;
            for (int j = 0; j < size; j++) {
                if (result[j] == arr[i]) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                result[size] = arr[i];
                size++;
            }
        }

        int[] unique = new int[size];
        for (int i = 0; i < size; i++) {
            unique[i] = result[i];
        }
        return unique;
    }

    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        int[][] samples = {
            {1, 2, 2, 3, 1, 2},
            {5, 5, 5, 5},
            {1, 2, 3, 4},
            {7}
        };

        for (int[] sample : samples) {
            printArray(sample);
            System.out.print(" -> ");
            printArray(removeDuplicates(sample));
            System.out.println();
        }
    }
}
