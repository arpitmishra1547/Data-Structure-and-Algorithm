package Question;
import java.util.Arrays;


public class Plus_One {
    public static void main(String[] args) {
        int[] arr = {4,9,9,9};
        char[] ans = tostring(arr);
        System.out.println(Arrays.toString(ans));

    }

    static char[] tostring(int[] arr) {
        int ans = 0;
        int temp = arr[0];
        for (int i = 0; i <= arr.length - 2; i++) {
            temp = (temp * 10) + arr[(i + 1)];
        }
        ans = temp + 1;
        return toarray(ans);
    }

    static char[] toarray(int ans) {

        char[] charArr = String.valueOf(ans).toCharArray();

//        System.out.println(Arrays.toString(charArr)); // [1, 2, 3, 4]
        return charArr;

    }
}


//
//int num = 1234;
//int temp = num;
//
//// Count digits
//int len = (int)Math.log10(num) + 1;
//int[] arr = new int[len];
//
//// Extract digits from end
//for (int i = len - 1; i >= 0; i--) {
//arr[i] = temp % 10;
//temp /= 10;
//        }
//
//        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]
