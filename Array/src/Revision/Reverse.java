package Revision;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        using2Pointer(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] reverse(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    static int[] using2Pointer(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start< end ){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
