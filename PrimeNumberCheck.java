// Check whether a single number is prime.
// e.g. 2, 17 and 97 are prime; 1, 0 and 100 are not.

public class PrimeNumberCheck {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 17, 97, 1, 0, 100, -7};
        for (int n : numbers) {
            System.out.println(n + (isPrime(n) ? " is prime" : " is not prime"));
        }
    }
}
