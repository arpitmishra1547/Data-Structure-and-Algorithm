import java.util.Scanner;

public class string_examp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
             String msg = greet(name);
             System.out.println(msg);

    }
//    static void greet(String name){
//        System.out.println("Hello"+name);
//    }

    static String greet(String naam) {
        String greeting = "Hello, " + naam + "!";
        return greeting;
    }
}
