package Question;

import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 0, 1};
        int len = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[temp];
            arr[len-1] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }
}





/*
. Mini Example (step by step)

Let’s say:
nums = [2, 0, 1] (length = 3)
For i = 0:
nums[0] = 2 → go to index 2
nums[2] = 1 → so ans[0] = 1
For i = 1:
nums[1] = 0 → go to index 0
nums[0] = 2 → so ans[1] = 2
For i = 2:
nums[2] = 1 → go to index 1
nums[1] = 0 → so ans[2] = 0
So final output:
ans = [1, 2, 0]

 */