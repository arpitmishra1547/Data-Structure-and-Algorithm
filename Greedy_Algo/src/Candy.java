//#leetcode135
public class Candy {
    public static void main(String[] args) {
        int [] ratings = {1,0,2};
        System.out.println(candy(ratings));
    }
    private static int candy(int[] ratings) {
        int sum = 1; // ✅ first child
        int i = 1;
        int n = ratings.length;

        while (i < n) {

            // flat case
            if (ratings[i] == ratings[i - 1]) {
                sum += 1;
                i++;
                continue;
            }

            int peak = 1;

            // increasing slope
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak++;
                sum += peak;
                i++;
            }

            int down = 1;

            // decreasing slope
            while (i < n && ratings[i] < ratings[i - 1]) {
                sum += down;
                i++;
                down++;
            }

            // fix peak
            if (down > peak) {
                sum += (down - peak);
            }
        }

        return sum;
    }
}
