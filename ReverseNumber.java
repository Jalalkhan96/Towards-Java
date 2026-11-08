// Reverse the digits of an integer, keeping the sign.
// e.g. 12345 -> 54321, -987 -> -789, 1000 -> 1

public class ReverseNumber {

    public static int reverse(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return sign * reversed;
    }

    public static void main(String[] args) {
        int[] numbers = {12345, -987, 1000, 7, 0};
        for (int n : numbers) {
            System.out.println(n + " reversed is " + reverse(n));
        }
    }
}
