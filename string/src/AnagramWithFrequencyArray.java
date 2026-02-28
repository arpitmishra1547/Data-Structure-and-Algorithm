import java.util.Arrays;

public class AnagramWithFrequencyArray {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(areAnagrams(s, t));  // true
    }

    // Checks if two strings are anagrams of each other
    static boolean areAnagrams(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert to char arrays
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        // Sort both arrays
        Arrays.sort(sc);
        Arrays.sort(tc);

        // Compare each character
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] != tc[i]) {
                return false;  // mismatch found
            }
        }

        // All characters match in order
        return true;
    }
}
