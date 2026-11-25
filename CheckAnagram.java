// CheckAnagram.java
// Checks whether two strings are anagrams of each other: same letters in
// a different order. The check is case-insensitive and ignores spaces,
// so "Dormitory" and "dirty room" count as anagrams.

public class CheckAnagram {

    public static boolean isAnagram(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        String a = first.replaceAll("\\s+", "").toLowerCase();
        String b = second.replaceAll("\\s+", "").toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] counts = new int[256];
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i)]++;
            counts[b.charAt(i)]--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] samples = {
            {"listen", "silent"},
            {"hello", "world"},
            {"Dormitory", "dirty room"},
            {"Apple", "APPLES"},
            {"triangle", "integral"}
        };

        for (String[] pair : samples) {
            System.out.println("\"" + pair[0] + "\" and \"" + pair[1]
                    + "\" -> " + (isAnagram(pair[0], pair[1])
                    ? "anagrams" : "not anagrams"));
        }
    }
}
