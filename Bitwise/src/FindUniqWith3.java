public class FindUniqWith3 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr) {
        int[] bit = new int[32];

        // count bits
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                bit[i] += (num & (1 << i));
            }
        }

        // take mod 3 and rebuild number
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bit[i] % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
