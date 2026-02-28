package Question;

import java.util.Arrays;

public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
//        System.out.println(Arrays.toString(num));
       int[] ans = add(num,k);
        System.out.println(Arrays.toString(ans));
    }

    static int[] add(int[]num,int k){
        int temp = num[0];
        int count = 0;
      for (int i = 0 ; i< num.length-1; i++){

          count = temp*10+num[i+1];
          temp = count;
      }
      return convertarray(count);
    }

    static int[] convertarray(int count){
        String str = String.valueOf(count);
        int[] arr = new int[str.length()];
        for(int i = 0; i< str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }
//    static int[] convertarray(int count){
//
//        int[] arr = new int[4];
//        int i = 0;
//       while (count>0){
//           int temp= count%10;
//           arr[i]= temp;
//           count = count / 10;
//           i++;
//       }
//        return arr;
//    }


}
