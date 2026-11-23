// Check whether a number is a perfect number: a positive integer that
// equals the sum of its proper divisors, e.g. 6 = 1 + 2 + 3 and
// 28 = 1 + 2 + 4 + 7 + 14.

public class CheckPerfectNumber {

    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 28, 496, 12, 1, 0, -6};
        for (int n : numbers) {
            System.out.println(n + (isPerfect(n) ? " is a perfect number" : " is not a perfect number"));
        }
    }
}
