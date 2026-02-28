public class ReverseWords {

    public static void main(String[] args) {
        String input = "   I love    java";
        String reversed = reverseWordsInSentence(input);
        System.out.println(reversed);   // Output: "java love I"
    }

    /**
     * Reverses the order of words in a sentence.
     * - Removes extra spaces at the beginning and end.
     * - Keeps only one space between words.
     *
     * Example:
     *  Input:  "   I   love    java  "
     *  Output: "java love I"
     */
    static String reverseWordsInSentence(String sentence) {
        // 1. Remove leading and trailing spaces
        sentence = sentence.trim();

        // 2. Split the sentence into words
        // "\\s+" is a regex that means: one or more whitespace characters
        // This handles multiple spaces between words
        String[] words = sentence.split("\\s+");

        // 3. Reverse the array of words and join back into a single string
        return buildReversedSentence(words);
    }

    /**
     * Takes an array of words and builds a string
     * with the words in reverse order, separated by a single space.
     */
    static String buildReversedSentence(String[] words) {
        StringBuilder builder = new StringBuilder();

        // Loop from last word to first
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]);   // add current word

            // Add a space between words, but not after the last one
            if (i != 0) {
                builder.append(" ");
            }
        }

        // Convert StringBuilder to a normal String
        return builder.toString();
    }

    // ❌ Old method (hard-coded indexes) – kept here just for learning
    // This only works for very specific strings and is not reusable.
    // static void reverse(String s) {
    //     String sb1 = s.substring(0, 5);
    //     String sb2 = s.substring(6);
    //     String ss = sb1.replace(sb1, sb2);
    //     String st = sb1.replace(sb2, sb1);
    //     String ff = ss + " " + st;
    //     System.out.println(ff);
    // }
}
