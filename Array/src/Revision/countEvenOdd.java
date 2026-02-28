package Revision;

public class countEvenOdd {
    public static void main(String[] args) {
        int[] arr = {22,33,44,55,66};
        System.out.println(even(arr));
    }
    static int even(int[] arr){
        int count = 0;
        int odd = 0;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
            else{
                odd++;
            }
        }
        return count;
    }
}
