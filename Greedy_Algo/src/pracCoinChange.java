import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class pracCoinChange {
    public static void main(String[] args) {
        Integer[] coins = {1,5,10};

        Arrays.sort(coins,Comparator.reverseOrder());

        int countCoins = 0;
        int amt = 27;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amt){
                while(coins[i] <= amt){
                    countCoins++;
                    list.add(coins[i]);
                    amt -= coins[i];

                }
            }
        }
        System.out.println(countCoins);
        System.out.println(list);
        System.out.println(String.valueOf(list));
    }
}
