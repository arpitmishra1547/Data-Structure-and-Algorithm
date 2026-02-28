package Question;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] ans = findIndex(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findIndex(int[] nums, int target){
        int[] arr = new int[2];
        for (int i = 0; i<=nums.length; i++){
            for (int j = 0; j<=nums.length; j++){
              if(nums[i]+nums[j]==target){
                  arr[0]=i;
                  arr[1]=j;
                  return arr;
              }

            }

        }
     return new int[]{-1, -1};
    }
}
