// LeetCode 1662: Check If Two String Arrays are Equivalent

public class leetcode1662 {
    public static void main(String[] args) {
        String[] word1 = {"a", "b", "c"};
        String[] word2 = {"a", "b", "c"};

        System.out.println(arrayStringsAreEqual(word1, word2)); // Output: true
    }

    static Boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        // Build string from first array
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);  // append each string in word1
        }

        // Build string from second array
        StringBuilder sb2 = new StringBuilder();
        for (int j = 0; j < word2.length; j++) {
            sb2.append(word2[j]);  // append each string in word2
        }

        // Compare final strings
        return sb1.toString().equals(sb2.toString());
    }
}
