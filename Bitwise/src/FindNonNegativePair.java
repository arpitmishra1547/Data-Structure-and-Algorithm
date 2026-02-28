public class FindNonNegativePair {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 3, -4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int result = 0;

        for(int num : arr) {
            boolean hasPair = false;

            for(int n : arr){
                if(n == -num){
                    hasPair = true;
                    break;
                }
            }
            if (!hasPair){
                result = num;
                return result;
            }
        }
        return result;
    }
}
