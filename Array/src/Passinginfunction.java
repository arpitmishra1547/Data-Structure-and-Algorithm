import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        int[] arr = {3,33,5,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int [] nums){
        nums[0] = 99;
    }
}
