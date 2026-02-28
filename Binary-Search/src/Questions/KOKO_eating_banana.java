package Questions;

import java.util.Arrays;

public class KOKO_eating_banana {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));

    }
    static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(piles, h, mid)) {
                ans = mid;
                high = mid - 1;   // minimize
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }
    static boolean isPossible(int[] piles, int h, int speed) {
        int hours = 0;
        for (int p : piles) {
            hours += (p + speed - 1) / speed; // ceil division    (a + b - 1) / b

        }
        return hours <= h;
    }
}
