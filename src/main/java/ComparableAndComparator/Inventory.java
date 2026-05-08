package ComparableAndComparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void add(T item) {
//        if (item.getQuantity() < 0) {
//            throw new InvalidQuantityException("Quantity is less than equal to zero which is invalid");
//        }
//        if (items.containsKey(item.getId())) {
////            System.out.println("Item " + item.getId() + " already exists");
//            throw new DuplicateItemException("Item " + item.getId() + " already exists");
//        }
        items.put(item.getId(), item);
    }

    public void remove(T item) {
        items.remove(item.getId());
    }

    public T get(String id) {
        return items.get(id);
    }

    public List<T> getAll() {
        return new ArrayList<>(items.values());
    }
}

