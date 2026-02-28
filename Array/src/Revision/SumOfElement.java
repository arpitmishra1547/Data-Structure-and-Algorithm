package Revision;

public class SumOfElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(sum(arr));

    }
    static int sum(int[] arr){
        int sum = 0 ;
        for(int i = 0 ; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
