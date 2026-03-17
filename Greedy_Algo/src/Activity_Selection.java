import java.util.ArrayList;

public class Activity_Selection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end =   {2,4,6,7,9,9};

        ArrayList<Integer> ans = new ArrayList<>();

        // select first activity
        int maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        System.out.println("Selected Activities Index = " + ans);
    }
}