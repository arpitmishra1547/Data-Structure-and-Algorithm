package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2};
        subset(arr, 0, new ArrayList<>());
//        List<List<Integer>> ans = subset(arr);
//        for (List<Integer> list : ans) {
//            System.out.println(list);
//        }
    }

    static List<List<Integer>> subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();   // list that will store all subsets
        outer.add(new ArrayList<>());                    // add empty subset [] (power set always starts with it)
        for (int num : arr) {                            // iterate through each number in the input array
            int n = outer.size();                        // store current number of subsets before adding new ones
            for (int i = 0; i < n; i++) {                 // iterate only over existing subsets
                List<Integer> internal = new ArrayList<>(outer.get(i)); // copy the current subset
                internal.add(num);                       // add current element to the copied subset
                outer.add(internal);                     // add this new subset to the outer list
            }
        }
        return outer;                                    // return all generated subsets
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;

    }



    static void subset(int[] arr, int index, List<Integer> list){

        if(index == arr.length){
            System.out.println(list);
            return;
        }

        // take element
        list.add(arr[index]);
        subset(arr, index + 1, list);

        // backtrack
        list.remove(list.size() - 1);

        // skip element
        subset(arr, index + 1, list);
    }
}