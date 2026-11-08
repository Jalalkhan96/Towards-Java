// Sum of the digits of an integer (absolute value, so negatives work too).
// e.g. 12345 -> 15, -987 -> 24, 1000 -> 1, 7 -> 7

public class SumOfDigits {

    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {12345, -987, 1000, 7, 0};
        for (int n : numbers) {
            System.out.println("Sum of digits of " + n + " = " + sumOfDigits(n));
        }
    }
}
