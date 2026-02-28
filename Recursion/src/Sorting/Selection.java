package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5};
        int n = arr.length;
        selection(arr,n,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(
            int[] arr,
            int n,
            int i,
            int max
    ) {

        // Base case: array is sorted
        if (n == 0) {
            return;
        }

        // Finding maximum element in unsorted part
        if (i < n) {

            if (arr[i] > arr[max]) {
                // Update max
                selection(arr, n, i + 1, i);
            } else {
                selection(arr, n, i + 1, max);
            }

        } else {
            // Swap max element with last element of unsorted part
            int temp = arr[max];
            arr[max] = arr[n - 1];
            arr[n - 1] = temp;

            // Reduce unsorted size and restart search
            selection(arr, n - 1, 0, 0);
        }
    }

    static void selection1(int[] arr, int start) {

        // Base case: array is sorted
        if (start == arr.length-1) {
            return;
        }

        // Finding maximum element in unsorted part
        int minIndex = start;
        for (int j = start + 1; j < arr.length; j++) {
            if(arr[j] < arr[start]){
                start = j;
        }

        }
            // Swap max element with last element of unsorted part
            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;

            // Reduce unsorted size and restart search
            selection1(arr, start+1);
        }
    }



