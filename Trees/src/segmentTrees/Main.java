package segmentTrees;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,8,-2,-4,5,8};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();
    }
}
