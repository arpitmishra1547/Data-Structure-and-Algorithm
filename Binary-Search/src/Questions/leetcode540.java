package Questions;

public class leetcode540 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if ( nums[mid] < nums[mid+1]) {
                start = mid+1;
            } else if (nums[mid] > nums[mid+1]){
                end  = mid ;
            }
        }
        return start;
    }
}
