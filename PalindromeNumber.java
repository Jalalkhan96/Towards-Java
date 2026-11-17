// Check whether a number reads the same forwards and backwards.
// e.g. 121 and 1221 are palindromes; 123 and -121 are not.

public class PalindromeNumber {

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int[] numbers = {121, 1221, 123, 0, 7, -121, 12321};
        for (int n : numbers) {
            System.out.println(n + (isPalindrome(n) ? " is a palindrome" : " is not a palindrome"));
        }
    }
}
