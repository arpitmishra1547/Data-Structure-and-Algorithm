package Questions;

public class leetcode33 {
    public static void main(String[] args) {
       int[] nums = {4,5,6,7,0,1,2};
       int target = 6;
        System.out.println(search(nums,target));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){
                if(nums[mid]== target){
                    return mid;
                }
                if (target > nums[mid] ) {
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }
        }

        return -1;
    }
}
