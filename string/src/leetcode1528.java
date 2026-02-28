// LeetCode 1528: Shuffle String

public class leetcode1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));   // Output: leetcode
    }

    static String restoreString(String s, int[] indices) {

        // Create a char array to store characters at their new positions
        char[] result = new char[s.length()];

        // For each character in s:
        // Place s[i] into its correct new position: indices[i]
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }

        // Convert char array back to a string
        return new String(result);
    }
}
