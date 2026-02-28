public class rotateRight {
    public static void main(String[] args) {
        String s = "ARPIT";
        int k = 2;
        System.out.println(rotateRight(s,k));
    }

    static String rotateRight(String s, int k) {
        int n = s.length();
        k = k % n;  // important for large k

        return s.substring(n - k) + s.substring(0, n - k);
    }

}
