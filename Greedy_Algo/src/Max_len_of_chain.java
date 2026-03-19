import java.util.Arrays;
import java.util.Comparator;

/*
Max Length Chain of Pairs
You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.
A pair (c, d) can come after pair (a, b) if b < c.

👉 Task:
Find the maximum length chain that can be formed from a given set of pairs.
 */

public class Max_len_of_chain {
    public static void main(String[] args) {
        int[][] chain = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(chain, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = chain[0][1];

        for (int i = 0; i < chain.length; i++) {
            if(chain[i][0] > chainEnd) {
                chainLen++;
                chainEnd = chain[i][1];
            }
        }
        System.out.println("max length of chain = " + chainLen);

    }
}
