package easy;

public class onetoN {
    public static void main(String[] args) {

        funRev(5);

    }
    static void oneton(int n){
        if(n==0) return;
        System.out.println(n);
        oneton(n-1);
    }


    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
