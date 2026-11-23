// Count the vowels (a, e, i, o, u, case-insensitive) in a string.
// e.g. "Hello World" has 3 vowels, "AEIOUaeiou" has 10, "rhythm" has 0.

public class CountVowelsInString {

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"Hello World", "AEIOUaeiou", "rhythm", "Programming", ""};
        for (String s : words) {
            System.out.println("\"" + s + "\" has " + countVowels(s) + " vowel(s)");
        }
    }
}
