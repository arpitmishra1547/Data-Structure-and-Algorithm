import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_Coin {
    /*
Indian Coins Problem:

We are given an infinite supply of coins/notes of the following denominations:
[1, 2, 5, 10, 20, 50, 100, 500, 2000]

👉 Task:
Find the minimum number of coins/notes required to make change for a given value
     */

    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amt = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amt){
                while(coins[i] <= amt){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println("total (min) coins used = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
        }

    }
}
