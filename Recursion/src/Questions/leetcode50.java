package Questions;

public class leetcode50 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 2;
        System.out.println(myPow(x, n));   //1024.00000
    }

    // not acceptable in leetcode
    static double myPow2(double x, int n, int i, double count) {
        if (i == Math.abs(n)) {
            return count;
        }
        if (n < 0) {
            return myPow2(x, n, i + 1, (1 / x) * (count));
        } else {
            return myPow2(x, n, i + 1, x * count);
        }
    }

    // acceptable but i use buildin funtion
    public double myPow1(double x, int n) {
        return Math.pow(x, n);
    }


// actual logic is this


    static double myPow(double x, int n) {
        if (n == 0) return 1.0;

        long binform = n;
        if (binform < 0) {
            x = 1 / x;
            binform = -binform;
        }

        double ans = 1.0;

        while (binform > 0) {
            if ((binform & 1) == 1) {
                ans *= x;   // ✅ FIXED
            }
            x *= x;
            binform >>= 1;
        }

        return ans;
    }

}

