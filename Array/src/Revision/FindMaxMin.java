package Revision;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {4,56,7,2,6,65};
        System.out.println(mi(arr));
    }
    static int max(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>min){
               min = arr[i];
            }
        }
        return min;
    }

    static int min(int[] arr){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max){
               max = arr[i];
            }
        }
        return max;
    }
    static int mi(int[] arr){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
          max = Math.min(max,arr[i]);
        }
        return max;
    }
}
