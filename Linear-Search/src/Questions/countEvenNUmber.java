package Questions;

public class countEvenNUmber {
    public static void main(String[] args) {
        int[] arr = {2488, 3767, 4888, 55, 1444, 67999, 7};
         int ans = count(arr);
         System.out.println(ans);
    }

    static int count(int[] arr) {
       int count = 0;
       for(int num : arr) {
            if (even(num)) {
                count++;
            }
        }
       return count;

    }
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        if(num<0){
            return num* -1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        if(num>0){
            count++;
            count = num/10;
        }
        return count ;
    }


}
