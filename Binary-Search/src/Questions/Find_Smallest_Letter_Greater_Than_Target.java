package Questions;

public class Find_Smallest_Letter_Greater_Than_Target {

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
//        char[] arr = {};
        char target = 'i';
        char ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static char binarySearch(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }

    static int nextGreater(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {    // STRICTLY GREATER
                ans = arr[mid];
                end = mid - 1;          // search left
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

}