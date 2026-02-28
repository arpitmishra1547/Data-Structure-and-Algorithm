//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

       int i = sum2();
       System.out.println(i);

    }

   static void sum1(){
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        return sum;
    }
}
