public class leetcode796 {
    public static void main(String[] args) {
       String s = "aa", goal = "a";
        System.out.println(rotateString(s,goal));
    }

    static boolean rotateString(String s, String goal) {
        String newS = s + s;
        if(newS.contains(goal)){
            return true;
        }
        return false;
    }
}
