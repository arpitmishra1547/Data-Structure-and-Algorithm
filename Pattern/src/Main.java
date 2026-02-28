//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     patten31(4);
        }

        static void patten1(int n){
        for(int row =1;row<=n;row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
         }
//        static void patten2(int n){
//        for(int row =1;row<=n;row++){
//            for(int col = n; col>=row; col--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        }
        static void patten2(int n){
        for(int row =1;row<=n;row++){
            for(int col = 1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }



    static void patten4(int n){
        for(int row =1;row<=n;row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }


    }
//    static void patten5(int n){
//        for(int row = 1; row<= (2*n)-1; row++){
//            if(row<=n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else{
//                    for(int col = 1; col<=(2*n)-row; col++){
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//            }
//        }

    static void patten5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patten31(int n) {
        for (int row = 1; row < 2 * n; row++) {

            for (int col = 0; col < 2*n; col++) {
                System.out.print((n)-row);
            }
            System.out.println();
        }
    }


    static void patten28(int n) {
        for (int row = 0; row <  n; row++) {
            int totalColsInRow = row <= n ? (2 * row) - 1: row;

            int noOfSpaces = 2*n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    }





