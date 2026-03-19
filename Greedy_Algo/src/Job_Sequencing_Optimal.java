import java.util.*;

public class Job_Sequencing_Optimal {

    static class Job {
        int id, deadline, profit;

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

        // Step 1: Sort by profit descending
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find max deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create slots
        int[] slot = new int[maxDeadline];
        Arrays.fill(slot, -1);

        int count = 0;
        int totalProfit = 0;

        // Step 4: Assign jobs
        for (int i = 0; i < jobs.length; i++) {
            Job curr = jobs[i];

            for (int j = curr.deadline - 1; j >= 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = curr.id;
                    count++;
                    totalProfit += curr.profit;
                    break;
                }
            }
        }

        // Output
        System.out.println("Max Jobs = " + count);
        System.out.println("Total Profit = " + totalProfit);

        System.out.print("Job sequence: ");
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] != -1) {
                System.out.print(slot[i] + " ");
            }
        }
    }
}