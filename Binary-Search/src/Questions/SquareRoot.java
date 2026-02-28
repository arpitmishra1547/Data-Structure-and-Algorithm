package Questions;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(root(n));

    }
    static int root(int n ){

       for (int i = 1;i<=n;i++){
           if(i*i==n){
               return i;
           }
       }
       return -1;
    }
}
