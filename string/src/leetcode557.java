// LeetCode 557: Reverse Words in a String III

import java.util.Arrays;

public class leetcode557 {
    public static void main(String[] args) {
        String s = "Mr Ding";
        reverseWords(s);
    }

    // Function to reverse each word in the sentence but keep word order same
    static String reverseWords(String s) {

        StringBuilder sb2 = new StringBuilder(); // final answer builder

        // Split the string into words using space(s)
        String[] words = s.split("\\s+");

        // Process each word one by one
        for (int i = 0; i < words.length; i++) {

            // Reverse the current word
            StringBuilder sb1 = new StringBuilder(words[i]);
            sb1.reverse();

            // Add reversed word to final string
            sb2.append(sb1);

            // Add space between words, but NOT after last word
            if (i != words.length - 1) {
                sb2.append(" ");
            }
        }

        return sb2.toString();
    }
}
