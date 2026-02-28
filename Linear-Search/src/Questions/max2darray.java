package Questions;

import java.util.Arrays;

public class max2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,11,4},
                {4,5,6},
                {7,8}
        };

        int ans = Search2d(arr);
        System.out.println(ans);
    }

    static int Search2d(int[][] arr) {
        int temp = 0;
        for (int i = 0 ; i< arr.length ; i++){

            for (int j = 0 ; j< arr[i].length; j++){

                if(arr[i][j]> temp) {
                   temp = arr[i][j];
                }
            }
        }
        return temp;
    }
}


