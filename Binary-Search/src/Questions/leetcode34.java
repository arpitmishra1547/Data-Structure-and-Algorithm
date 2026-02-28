package Questions;

import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target = 8;
       int ans = searchRange(nums,target);
       int ans1 = searchRange1(nums,target);
       int[] arr = new int[]{ans,ans1};
       System.out.println(Arrays.toString(arr));
    }

    static int searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid]== target){
            ans = mid;
            end = mid-1;
            }else if(target> nums[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }

        return ans;
    }
    static int searchRange1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans1 = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid]== target){
            ans1 = mid;
            start = mid+1;
            }else if(target> nums[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }

        return ans1;
    }
}
