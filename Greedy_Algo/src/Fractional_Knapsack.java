import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {

    /*
 Problem: Fractional Knapsack
 Given N items with values[] and weights[], and capacity W,
 you can take fractions of items.
 Find the maximum total value that can be obtained.
     */
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] wei = {10,20,30};
        int w = 50;

        double[][] ratio = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wei[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int finalVal = 0;
        int capacity = w;

        for(int i = ratio.length-1; i >= 0 ; i--) {
            int idx =(int)ratio[i][0];

            if(capacity >= wei[idx]){
                finalVal += val[idx];
                capacity -= wei[idx];
            }
            else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final  " + finalVal);
    }
}
