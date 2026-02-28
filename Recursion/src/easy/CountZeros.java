package easy;

public class CountZeros {
    public static void main(String[] args) {
        int n = 100120030;
        System.out.println(count(n));
    }
    static int count(int n){
         return helper(n,0);
    }
    static int helper(int n , int c){
        if(n==0){
            return c;
        }
        int rem = n % 10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
