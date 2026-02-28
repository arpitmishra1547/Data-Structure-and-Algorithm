package Easyleetcode;

public class leetcode53 {
    public static void main(String[] args) {
       int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray2(nums));
    }

    static int maxSubArray(int[] nums) {               // Brute force
    int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            for(int j = i ; j < nums.length ; j++){
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum = sum+nums[k];
                     max = Integer.max(sum,max);
                }
            }
        }
        return max;
    }

    static int maxSubArray1(int[] nums) {               // Better
    int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            int sum = 0;
            for(int j = i ; j < nums.length ; j++){
                    sum = sum+nums[j];
                     max = Integer.max(sum,max);
            }
        }
        return max;
    }


    static int maxSubArray2(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum > max ){
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
