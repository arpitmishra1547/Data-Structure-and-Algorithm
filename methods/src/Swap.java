public class Swap {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        swap(a,b);
        System.out.println(a+" "+b);

        String name = "arpit mishra";
        String msg = greet(name);
        System.out.println(msg);
//                changename(name);
//                System.out.println(name);
    }
    static void swap(int a,int b){
        int temp =a;
        a=b;
        b = temp;
    }
//    static void changename(String name){
//        name = "ashu mishra";
//    }

    static String greet(String name){
        name =" Ashu mishra";
        return name ;
    }
}

