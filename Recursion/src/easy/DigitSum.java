package easy;

public class DigitSum {
    public static void main(String[] args) {
        int ans = 1342;
        System.out.println(sum(ans));
        }
        static int sum(int n ){
        if(n==0) return 0;
        return  sum(n/10) + n %10;
        }
}
