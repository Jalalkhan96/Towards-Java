// Sum the even numbers in an array of integers.
// e.g. the even sum of {1, 2, 3, 4, 5, 6} is 12; of {1, 3, 5} it is 0.

public class SumOfEvenNumbers {

    public static int sumOfEvens(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("Even sum of {1, 2, 3, 4, 5, 6}: " + sumOfEvens(numbers));

        int[] oddsOnly = {1, 3, 5};
        System.out.println("Even sum of {1, 3, 5}: " + sumOfEvens(oddsOnly));

        int[] withNegatives = {-2, -3, 4, 7, 10};
        System.out.println("Even sum of {-2, -3, 4, 7, 10}: " + sumOfEvens(withNegatives));
    }
}
