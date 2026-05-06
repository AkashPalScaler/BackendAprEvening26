package ComparableAndComparator;

import java.util.Comparator;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    // The class's natural ordering property (default property for ordering)
    @Override
    public int compareTo(Item other) {
        // This function is internally called by Collections.sort to compare to values and swap
        // this (1st item), other (2nd item) | item1, item2, item3, item4 | 1, 2, 4
        // if return -ve -> it will not swap
        // if return +ve -> it will swap
        // if 2 values are equal we need to return 0

        // Logic for ascending/increasing order:
//        if(this.price > other.price){
//            return 1;
//        }else if (this.price < other.price){
//            return -1;
//        }else{
//            return 0;
//        }
//        return (int)this.price - (int)other.price;

        // Logic for descending/decreasing order:
//        if(this.price < other.price){
//            return 1;
//        }else if (this.price > other.price){
//            return -1;
//        }else{
//            return 0;
//        }
        return (int)other.price - (int)this.price;

    }
}

