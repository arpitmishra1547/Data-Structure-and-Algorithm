package String;

public class Stream {
    public static void main(String[] args) {
        String up = "baccad";
        skip("",up);

    }

    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p,up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }


    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
           return skip1(up.substring(1));
        }
        else{
            return ch + skip1(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }


    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
