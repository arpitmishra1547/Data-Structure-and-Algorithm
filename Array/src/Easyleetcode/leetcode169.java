package Easyleetcode;

import java.util.Arrays;

public class leetcode169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

//    Boyer–Moore Voting Algorithm
    // optimised solution
//Important Note
//    Works only if a majority element is guaranteed to exist.
static int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;

    for (int num : nums) {
        if (count == 0) {
            count = 1;
            candidate = num;
        }
        else if (num == candidate) count++;
        else count--;
    }


    int cnt = 0;
    for(int num : nums){
        if(num == candidate) cnt++;
    }
    if(cnt> nums.length/2){
        return candidate;
    }
    return -1;

}



// Normal method using sorting
    // Time Complexity: O(n log n)

    static int majorityElement1(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int majority = nums.length / 2;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > majority) {
                return nums[i];
            }
        }
        return nums[0]; // majority element is guaranteed
    }

}
