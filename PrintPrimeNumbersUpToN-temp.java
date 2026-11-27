// Print all prime numbers from 2 up to a given limit n.
// e.g. primes up to 10 are 2, 3, 5, 7; primes up to 30 are
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.

public class PrintPrimeNumbersUpToN {

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

    public static void printPrimesUpTo(int limit) {
        System.out.print("Primes up to " + limit + ": ");
        boolean first = true;
        for (int n = 2; n <= limit; n++) {
            if (isPrime(n)) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(n);
                first = false;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPrimesUpTo(10);
        printPrimesUpTo(30);
        printPrimesUpTo(1);
    }
}
