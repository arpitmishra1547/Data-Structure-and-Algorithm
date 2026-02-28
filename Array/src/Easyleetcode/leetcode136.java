package Easyleetcode;

public class leetcode136 {
    public static void main(String[] args) {
        int[]  nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));

    }
    static int singleNumber(int[] nums) {
        int count = 0;
        for(int num : nums){
            count ^= num;
        }
        return count;
    }
}
