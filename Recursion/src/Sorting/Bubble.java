package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5};
        int n = arr.length;
        bubble(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr ,int i, int n){
        if(n == 1){
            return;
        }

        if(i == n-1){
            bubble(arr,0,n-1);
            return;
        }

        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        bubble(arr,i+1,n);
    }
    static void bubble1(int[] arr , int n){
        if(n == 1){
            return;
        }

        boolean isSwapped = false;

        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                isSwapped = true;
            }
        }

       if(!isSwapped) return;

        bubble1(arr,n-1);
    }
}
