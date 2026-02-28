public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "aBcba";
        System.out.println(isPalindrome(input));   // Output: true
    }

    /**
     * Checks whether a given string is a palindrome.
     * A palindrome reads the same forward and backward.
     * This check is case-insensitive.
     *
     * Examples:
     *   "abcba"  -> true
     *   "aBcBa"  -> true
     *   "hello"  -> false
     */
    static boolean isPalindrome(String text) {
        // If the string is null or empty, we treat it as a palindrome.
        // (This is a design choice; some people may handle null differently.)
        if (text == null || text.length() == 0) {
            return true;
        }

        // Convert to lowercase so that case doesn't matter:
        // 'A' and 'a' should be considered equal.
        text = text.toLowerCase();

        // Use two-pointer technique: one from the start, one from the end
        // We only need to go till the middle of the string.
        for (int left = 0; left < text.length() / 2; left++) {
            int right = text.length() - 1 - left;

            char startChar = text.charAt(left);   // character from the left side
            char endChar   = text.charAt(right);  // character from the right side

            // If any pair of characters doesn't match, it's not a palindrome.
            if (startChar != endChar) {
                return false;
            }
        }

        // If we completed the loop without mismatches, it's a palindrome.
        return true;
    }
}
