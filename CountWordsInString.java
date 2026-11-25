// CountWordsInString.java
// Counts the words in a string. A word is a run of non-space characters,
// so multiple spaces, leading and trailing spaces are all handled.

public class CountWordsInString {

    public static int countWords(String text) {
        if (text == null) {
            return 0;
        }
        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        // Split on one or more whitespace characters.
        return trimmed.split("\\s+").length;
    }

    public static void main(String[] args) {
        String[] samples = {
            "hello world from C",
            "  hello   world  ",
            "one",
            "",
            "   "
        };

        for (String sample : samples) {
            System.out.println("\"" + sample + "\" -> "
                    + countWords(sample) + " words");
        }
    }
}
