package Questions;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,3,};
        int start = 1;
        int end = 4;
        int target = 2;
        int ans = Inrange(arr, start, end, target);
        System.out.println(ans);
    }

    static int Inrange(int[] arr, int start, int end, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i<=end; i++){
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
