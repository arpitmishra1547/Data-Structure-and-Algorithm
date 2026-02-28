package Question;

import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,-1},
                {-10,5,11},
                {-18,-7,6}
        };

        int[][] ans = transpose(arr);
        for (int[] a : ans){
            System.out.println(Arrays.toString(a));
        }


    }

    static int[][] transpose(int[][] arr){
        int[][] temp= new int[3][3];
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col < arr[row].length; col++){
                temp[col][row]=arr[row][col];
            }
        }
        return temp;
    }
}
