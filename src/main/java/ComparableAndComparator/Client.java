package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(2, 4,6,1,8,3));
        Collections.sort(nums);
        System.out.println(nums);


        List<Item> items = new ArrayList<>(List.of(
                new Item("1", "iphone15", 1500, 12),
                new Item("2", "ipad2ndGen", 1200, 2),
                new Item("6", "ipad2ndGen", 1200, 2),
                new Item("3", "airpods3", 1000, 10),
                new Item("4", "mac", 2500, 4),
                new Item("5", "iphone17", 2100, 6)
        ));

        Collections.sort(items);

        for(Item item : items){
            System.out.println("Item Id : " + item.getId() + " | Item name : " + item.getName());
        }

        System.out.println("****************");

        Collections.sort(items, new ItemQuantityComparator());

        for(Item item : items){
            System.out.println("Item Id : " + item.getId() + " | Item name : " + item.getName());
        }

//        Inventory<Electronics> inventory = new Inventory<>();
//        Inventory<Books> inventory1 = new Inventory<Books>();
//        Inventory<Item> inventory2 = new Inventory<>();

    }
}
