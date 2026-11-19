// Find the sum of all elements in an array.
// e.g. {1, 2, 3, 4, 5} sums to 15, {10, 20, 30} sums to 60.

public class SumOfArrayElements {

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of {1, 2, 3, 4, 5} = " + sum(numbers));

        int[] tens = {10, 20, 30};
        System.out.println("Sum of {10, 20, 30} = " + sum(tens));

        int[] mixed = {-5, 10, -3, 8};
        System.out.println("Sum of {-5, 10, -3, 8} = " + sum(mixed));

        int[] single = {42};
        System.out.println("Sum of {42} = " + sum(single));
    }
}
