import java.util.Arrays;

public class pracFractional_Knapsack {

    static class Item {
        int val, wei;
        Item(int val, int wei) {
            this.val = val;
            this.wei = wei;
        }

        double getRatio() {
            return (double) val / wei;
        }
    }


    static void sortItems(Item[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].getRatio() < items[j].getRatio()) {
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
    }

    static double getMaxValue(Item[] items, int capacity) {
        sortItems(items);

        double totalValue = 0.0;
        for (Item item : items) {
            if (capacity - item.wei >= 0) {

                capacity -= item.wei;
                totalValue += item.val;
            } else {

                double fraction = ((double) capacity / (double) item.wei);
                totalValue += (item.val * fraction);
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {

        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        double maxVal = getMaxValue(items, 50);
        System.out.println( maxVal);
    }
}
