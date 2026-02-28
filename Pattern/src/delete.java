public class delete {
    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }
     static void pattern1(int n){
        for(int i =0 ; i<=5 ; i++){
            for(int j = 0; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i =1 ; i<=5 ; i++){
            for(int j = 1; j<=i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i =0 ; i<=5 ; i++){
            for(int j = 1; j<=(n-i); j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
        static void pattern5(int n){
        for(int i =1 ; i<=(2*n)-1 ; i++){
            if(i<=n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else{
                    for(int j = 1; j<=(2*n)-i; j++) {
                        System.out.print("*");
                    }
                }

            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i =0 ; i <= 5 ; i++){

                for (int j = 1; j <= n; j++) {
                    if(j<=n-i){
                        System.out.print(" ");
                }
                    else{
                        System.out.print("*");
                    }
                }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i =1 ; i <= 5 ; i++){
                for (int j = 1; j <= n; j++) {
                    if(j<=(i-1)) {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            System.out.println();
        }
    }
    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j >= n - (i - 1) && j <= n + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j >= i && j <= (2*n)-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j<=n-i) {
                    System.out.print(" ");
                }
                    else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void pattern11(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j<=i) {
                    System.out.print(" ");
                }
                    else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int spaces = (i < n) ? i : 2 * n - 1 - i;
            int stars  = n - spaces;


            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }


            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j == n - i || j == n + i || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j == (2*n) - i- 1 || j == i+1 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n) {
        // 2*n - 1 rows
        for (int i = 0; i < 2 * n - 1; i++) {

            if (i < n) {   // upper half including middle
                for (int j = 1; j < 2 * n; j++) {
                    if (j == n - i || j == n + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {       // lower half
                int k = i - (n - 1);   // 1,2,3,...
                for (int j = 1; j < 2 * n; j++) {
                    if (j == k + 1 || j == 2 * n - k - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
    static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j<=n-i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(i +" ");
                }
            }
            System.out.println();
        }
    }



}
