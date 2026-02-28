import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6};
        swap(arr,1,2);
     System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
