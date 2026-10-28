public class FibonacciMemo {
    // Memoised recursion: each Fibonacci number is computed only once,
    // so fib(n) runs in O(n) time instead of the naive O(2^n).
    static long[] memo;

    static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int[] demo = {10, 20, 30};
        for (int n : demo) {
            memo = new long[n + 1];
            System.out.println("fib(" + n + ") = " + fib(n));
        }
    }
}
