package Questions;
//👉 Ceiling = smallest element ≥ target

import java.util.ArrayList;

public class ceiling_of_number {
//    smallest number greater then target
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];   // possible ceiling
                end = mid - 1;    // search left
            } else {
                start = mid + 1;  // search right
            }
        }
        return ans;
    }
}




