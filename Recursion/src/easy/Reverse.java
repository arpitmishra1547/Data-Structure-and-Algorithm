package easy;


public class Reverse {
    public static void main(String[] args) {
        int n = 1234;
//        System.out.println(reverse2(n));
        reverse2(n);
        System.out.println(sum);
    }
    static int reverse1(int n){
    int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    static int helper(int n , int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digit-1)) + helper(n/10 , digit-1);

    }


    static int sum = 0;

    static void reverse2(int n ) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
          reverse2(n / 10);
    }

}
