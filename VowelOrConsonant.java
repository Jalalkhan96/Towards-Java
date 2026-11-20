public class VowelOrConsonant {
    // Check whether a letter is a vowel (a, e, i, o, u) or a consonant.
    // The check is case-insensitive; anything that is not a letter is
    // neither a vowel nor a consonant.
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    static String describe(char ch) {
        if (!Character.isLetter(ch)) return ch + " is not a letter";
        return ch + " is a " + (isVowel(ch) ? "vowel" : "consonant");
    }

    public static void main(String[] args) {
        char[] letters = { 'a', 'E', 'b', 'Z', 'u', '5' };
        for (char ch : letters) {
            System.out.println(describe(ch));
        }
    }
}
