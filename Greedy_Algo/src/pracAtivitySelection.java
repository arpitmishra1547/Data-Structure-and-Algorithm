import java.util.Arrays;
import java.util.Comparator;

public class pracAtivitySelection {

    public static void main(String[] args) {
        int activities[][] = {{1,3},{2,5},{3,9},{6,8},{8,10}};
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        int maxAct = 1;

        int lastEnd = activities[0][2];
    }
}
