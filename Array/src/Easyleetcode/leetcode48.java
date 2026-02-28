package Easyleetcode;

import java.util.Arrays;

public class leetcode48 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    // Brute Force
    static void rotate1(int[][] nums) {
        int[][] arr = new int[nums.length][nums[0].length];
        int n = nums[0].length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][n - 1 - i] = nums[i][j];
            }
        }
    }


    // Optimal

    static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix.length-1;
            while (start < end) {
                // swap
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }


    }
}