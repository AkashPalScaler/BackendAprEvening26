package ComparableAndComparator;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        // This function is internally called by Collections.sort to compare to values and swap
        // o1 (1st item), o2 (2nd item) | item1, item2, item3, item4 | 1, 2, 4
        // if return -ve -> it will not swap
        // if return +ve -> it will swap
        // if 2 values are equal we need to return 0

        // Ascending order
        return o1.getQuantity() - o2.getQuantity();
    }
}
