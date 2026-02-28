package Questions;

import java.util.Arrays;

public class Search2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {4,5,6},
                {7,8}
        };
        int target = 7;
        int[] ans = Search2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search2d(int[][] arr, int target) {

     for (int i = 0 ; i< arr.length ; i++){
         for (int j = 0 ; j< arr[i].length; j++){
            if(arr[i][j] == target) {

                return new int[] {i,j};
            }
         }
     }
     return new int[]{-1,-1};
    }
}
