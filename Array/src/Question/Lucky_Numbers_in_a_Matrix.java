package Question;

import java.util.Arrays;

public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
//        [[3,7,8],[9,11,13],[15,16,17]]
        int[][] arr = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };

        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[][]arr){
        int[] temp = new int[3];
        int ans = 0;
            for(int row = 0 ; row<arr.length;row++){
                int first = Integer.MAX_VALUE;
                for(int col = 0; col<arr[row].length;col++){
                    if(arr[row][col]<=first){
                        first = arr[row][col];
                        temp[row] = arr[row][col];
                    }
                }
            }
        for(int i = 0; i<temp.length;i++){
                       if(temp[i]>=ans){
                           ans=temp[i];

                       }

                   }
            return ans;
    }
}
