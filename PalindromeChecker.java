public class PalindromeChecker {
    // Case-insensitive and ignores spaces/punctuation,
    // so "A man, a plan, a canal: Panama" counts as a palindrome.
    static boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] demo = {"Madam", "hello", "A man, a plan, a canal: Panama", "Racecar"};
        for (String word : demo) {
            System.out.println("\"" + word + "\" -> palindrome? " + isPalindrome(word));
        }
    }
}
