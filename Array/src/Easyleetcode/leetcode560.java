package Easyleetcode;

public class leetcode560 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums,k));
    }

    static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length ; j++) {
                sum = sum + nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }


    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid]== target){
                return new int[]{start,end};
            }else if(target> nums[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }

        return new int{-1,-1};
    }
}
