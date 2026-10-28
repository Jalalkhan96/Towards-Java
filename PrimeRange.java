public class PrimeRange {
    static boolean isPrime(int n) {
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

    static void printPrimes(int low, int high) {
        System.out.print("Primes between " + low + " and " + high + ": ");
        for (int n = low; n <= high; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPrimes(10, 30);
        printPrimes(1, 10);
    }
}
