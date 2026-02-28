// LeetCode 1108: Defanging an IP Address

public class leetcode1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    // Function to replace every '.' with "[.]"
    static String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();  // to build the modified address
        char[] arr = address.toCharArray();      // convert string into a char array

        // traverse each character of the input string
        for (int i = 0; i < address.length(); i++) {

            // if we find a dot, replace it with "[.]"
            if (arr[i] == '.') {
                sb.append("[.]");
            }
            else {
                // otherwise just append the character as it is
                sb.append(arr[i]);
            }
        }

        // return the updated "defanged" IP address
        return sb.toString();
    }
}
