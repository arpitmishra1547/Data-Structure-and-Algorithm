import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Job_Sequencing {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int[][] jobsInfo = {{4,20}, {1,10}, {1,40}, {1,30}};

        Job[] jobs = new Job[jobsInfo.length];

        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(i, jobsInfo[i][0], jobsInfo[i][1]);
        }

        Arrays.sort(jobs, (obj1 , obj2) -> obj2.profit-obj1.profit);
        //descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.length; i++) {
            Job curr = jobs[i];
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i)+ " ");
        }
        System.out.println();
    }





}
