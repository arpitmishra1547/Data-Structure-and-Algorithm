// LeetCode 1678: Goal Parser Interpretation

public class leetcode1678 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));  // Output: Gooooal
    }

    static String interpret(String command) {

        StringBuilder sb = new StringBuilder();

        // Convert the entire command string into a char array
        char[] arr = command.toCharArray();

        // Loop through each character of the command
        for (int i = 0; i < command.length(); i++) {

            // Append current character to StringBuilder
            sb.append(arr[i]);

            // Check if the current content contains "()"
            int startWorld = sb.indexOf("()");
            if (startWorld != -1) {
                int endWorld = startWorld + "()".length();  // end index of "()"
                sb.replace(startWorld, endWorld, "o");      // replace "()" with "o"
            }

            // Check if the current content contains "(al)"
            int stWorld = sb.indexOf("(al)");
            if (stWorld != -1) {
                int enWorld = stWorld + "(al)".length();    // end index of "(al)"
                sb.replace(stWorld, enWorld, "al");         // replace "(al)" with "al"
            }
        }

        // Return the interpreted string
        return sb.toString();
    }
}
