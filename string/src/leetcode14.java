//Longest Common Prefix

public class leetcode14 {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr)); // Output: fl
    }

    // Function to find the longest common prefix among an array of strings
    static String longestCommonPrefix(String[] strs) {

        // If the array is empty or null, no prefix exists
        if (strs == null || strs.length == 0) return "";

        // Assume the first string is the prefix initially
        String prefix = strs[0];

        // Compare the assumed prefix with each string from index 1 onwards
        for (int i = 1; i < strs.length; i++) {

            // Keep reducing the prefix until the current string starts with it
            while (!strs[i].startsWith(prefix)) {

                // Remove the last character from the prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Whatever remains in prefix is the longest common prefix
        return prefix;
    }






    static void example(){
        String str = "programming";

        // ---------- startsWith() examples ----------

        // Checks if the string begins with "pro"
        System.out.println(str.startsWith("pro"));   // true

        // Checks if the string begins with "gram"
        System.out.println(str.startsWith("gram"));  // false

        // Checks if the substring starting at index 3 begins with "gram"
        // str.substring(3) = "gramming"
        System.out.println(str.startsWith("gram", 3)); // true



        // ---------- substring() examples ----------

        String s = "HelloWorld";

        // substring(startIndex):
        // Returns the substring from index 5 to end → "World"
        System.out.println(s.substring(5)); // World

        // substring(startIndex, endIndex):
        // Cuts string from index 0 to 4 → "Hello"
        System.out.println(s.substring(0, 5)); // Hello

        // Removing the last character using substring
        // s.length() - 1 gives last index (exclusive)
        String removedLast = s.substring(0, s.length() - 1);
        System.out.println(removedLast); // HelloWorl
    }
}
