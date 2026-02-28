package Easyleetcode;

import java.util.Arrays;

public class leetcode2149 {
    public static void main(String[] args) {
       int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    static int[] rearrangeArray(int[] nums) {

            int num = 0, num1 = 0;

            int[] arr = new int[nums.length / 2];   // positives
            int[] arr1 = new int[nums.length / 2];  // negatives

            // Step 1: separate
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    arr[num++] = nums[i];
                } else {
                    arr1[num1++] = nums[i];
                }
            }

            // Step 2: merge alternately
            int[] fin = new int[nums.length];
            int j = 0, k = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    fin[i] = arr[j++];
                } else {
                    fin[i] = arr1[k++];
                }
            }

            return fin;
        }

            }

