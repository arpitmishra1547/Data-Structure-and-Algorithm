public class delete {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isasce = arr[start]<arr[end];



        if(isasce) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
            else {

            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] < target) {

                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        }

       return -1;
    }
}
