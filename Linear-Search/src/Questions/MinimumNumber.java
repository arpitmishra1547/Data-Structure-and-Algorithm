package Questions;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,8,5,1,6,7};
//        System.out.println(Integer.MAX_VALUE);
        System.out.println(min(arr));



    }
//    static int min(int[] arr){
//           int temp = Integer.MAX_VALUE;
//        for (int i=0;i<arr.length;i++){
//           if (arr[i]<temp){
//               temp = arr[i];
//
//           }
//        }
//        return temp;



    // return the minimum value in the array
    static int min(int[] arr ){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(temp<arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
