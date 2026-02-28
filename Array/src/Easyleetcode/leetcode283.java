package Easyleetcode;

import java.util.Arrays;

public class leetcode283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    static void moveZeroes(int[] nums) {
      int k = 0;
      int count = 0;
        for (int i = 0; i < nums.length; i++) if(nums[i]==0) count++;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0)
            nums[k++] = nums[i];
            if(i>=nums.length-count){
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
