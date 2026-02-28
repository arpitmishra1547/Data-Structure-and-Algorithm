public class FindithBit {
    public static void main(String[] args) {
        int q = 35; // 35 -> 100011
        int n = 2;
        System.out.println(ans(q, n));
    }

    private static int ans(int q, int n) {
        return (q & (1 << (n - 1))) != 0 ? 1 : 0;
//        return (q & (1 << (n - 1)));
    }
}
