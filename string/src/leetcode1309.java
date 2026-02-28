// LeetCode 1309: Decrypt String from Alphabet to Integer Mapping

public class leetcode1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));  // Output: "jkab"
    }

    static String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();

        // Start from the end because "#"-based mappings have 3 characters ("10#")
        int i = s.length() - 1;

        while (i >= 0) {

            // If we find a '#', this means we have a 2-digit number like "10#"
            if (s.charAt(i) == '#') {

                // extract the previous two digits
                // example: if we are at '#' and previous digits are '1' and '0'
                // num = 10
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');

                // Convert number to character
                // 'a' + (1 → 0), (2 → 1), ... so subtract 1
                char ch = (char) ('a' + num - 1);

                sb.append(ch);

                // Move 3 steps back because we consumed "xy#"
                i -= 3;
            }
            else {
                // If there is no '#', it's a single digit number (1–9)

                int num = s.charAt(i) - '0';
                char ch = (char) ('a' + num - 1);

                sb.append(ch);

                i--; // move back 1 step
            }
        }

        // Since we decoded from right to left, reverse the result
        return sb.reverse().toString();
    }
}
