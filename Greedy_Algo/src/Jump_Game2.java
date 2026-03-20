//# leetcode45
public class Jump_Game2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(solve(nums,0,0));
    }


    private static int solve(int[] arr, int idx, int count) {
        int n = arr.length;

        if (idx >= n - 1) return count;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= arr[idx]; i++) {
            mini = Math.min(mini, solve(arr, idx + i, count + 1));
        }
        return mini;
    }
}
