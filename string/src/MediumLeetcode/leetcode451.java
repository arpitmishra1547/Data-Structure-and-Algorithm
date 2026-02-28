package MediumLeetcode;

public class leetcode451 {
    public static void main(String[] args) {
        String s = "Aabb";   //"eert"
        System.out.println(frequencySort(s));
    }

    static char[] frequencySort(String s) {
        boolean swapped;
        char[] arr = s.toCharArray();
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =  temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
       return arr;
    }
}
