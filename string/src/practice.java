public class practice {
    public static void main(String[] args) {

    }
     static boolean sameEnds(int[] nums, int len) {
        for(int i = 0; i <len ; i++){
            if(nums[i]==nums[nums.length-i-1]) return true;
        }
        return false;
    }

}
