package Easyleetcode;

public class leetcode121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit1(arr));
    }

    static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    static int maxProfit1(int[] prices) {
        int min = prices[0];
        int start = 0;

       for(int i = 0 ; i< prices.length; i++){
           if(min > prices[i]){
               min = prices[i];
           }
           else{
               start = Math.max(start,prices[i]-min);
           }

       }
       return start;
    }
}
