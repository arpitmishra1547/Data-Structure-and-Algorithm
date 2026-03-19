import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 Problem: Given start[] and end[] of activities (NOT sorted),
 select the maximum number of non-overlapping activities.
 Return indices of selected activities.
 (Hint: Sort activities by end time first)
 */

public class Activity_Selection_without_Sorted {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end   = {2,4,6,7,9,9};

        int activities[][] = new int[start.length][3];

        for(int i = 0; i < start.length; i++) {
            activities[i][0] = i;       // index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sort by end time
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        int maxAct = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];

        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities = " + maxAct);

        System.out.print("Selected Activities: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}