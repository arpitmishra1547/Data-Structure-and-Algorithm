// LeetCode 1021: Remove Outermost Parentheses

public class leetcode1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";   // Expected output: "()()()()(())"
        System.out.println(removeOuterParentheses(s));
    }

    static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int depth = 0;  // tracks how deep we are inside parentheses

        // Loop through every character of the string
        for (char c : s.toCharArray()) {

            if (c == '(') {

                // If depth > 0 → it's NOT the outermost '('
                // So we keep it
                if (depth > 0) sb.append(c);

                depth++; // entering deeper level

            } else { // c == ')'

                depth--; // exiting a level first

                // If depth > 0 → it's NOT the outermost ')'
                // So we keep it
                if (depth > 0) sb.append(c);
            }
        }

        return sb.toString(); // contains all inner parentheses only
    }
}
