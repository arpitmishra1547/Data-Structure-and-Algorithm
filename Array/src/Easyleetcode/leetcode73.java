package Easyleetcode;

import java.util.Arrays;

public class leetcode73 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,0}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        // 1️⃣ Mark rows & columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // 2️⃣ Set rows to zero
        for (int i = 0; i < m; i++) {
            if (zeroRow[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 3️⃣ Set columns to zero
        for (int j = 0; j < n; j++) {
            if (zeroCol[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


}
