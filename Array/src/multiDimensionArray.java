import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr2 = {
//                {1},
//                {4,5,6},
//                {8,9}
//        };

        int [][] arr = new int [3][2];
        System.out.println(Arrays.toString(arr));   //[[I@27716f4, [I@8efb846, [I@2a84aee7]   works on 1d array  Arrays.toString(arr) only prints the references (memory addresses) of the inner arrays, not their actual elements.
//      System.out.println(Arrays.deepToString(arr)); //[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]


   for ( int row =0 ; row <arr.length ; row++ ){
       for (int col =0 ; col < arr[row].length; col++){
           arr[row][col] = sc.nextInt();
       }
   }
//   for ( int row =0 ; row <arr.length ; row++ ){
//       for (int col =0 ; col < arr[row].length; col++){
//           System.out.print(arr[row][col] + " ");
//       }
//       System.out.println();
//   }
     for (int[] row : arr){
         System.out.println(Arrays.toString(row));
     }

        for ( int row =0 ; row <arr.length ; row++ ){
            System.out.println(Arrays.toString(arr[row]));
        }



    }
}
