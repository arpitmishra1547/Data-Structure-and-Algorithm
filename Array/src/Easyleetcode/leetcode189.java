package Easyleetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode189 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
    }


    static void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
             if (i<nums.length)
                 arr[(i+k)%nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }




}
