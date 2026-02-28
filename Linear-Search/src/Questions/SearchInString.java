package Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SearchInString {
    public static void main(String[] args) {
        String str = "ARPIT";
        char name = 'i';
        boolean b = checkString(str, name);
        System.out.println(b);
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(Arrays.toString(str.toCharArray()));


    }

    static boolean checkString(String str, char name) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == name) {
//                return true;
//            }
//        }


//        return IntStream.range(0, str.length()).anyMatch(i -> str.charAt(i) == name);


        for (int ch : str.toCharArray()) {
            if (ch == name ){
                return true;
            }
        }
        return false;
    }
}
