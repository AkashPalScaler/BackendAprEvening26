package ProducerConsumerWithSemaphore.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize; //Number of shelves present
    private ConcurrentLinkedDeque<Object> items; //Actual shelves

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        // Some pre-processing of item before adding
        // Item : Account creation request -> Each thread needs to probably fetch User DB to get some data, preference
        System.out.println("Producer producing, current size " + this.items.size());

        this.items.add(new Object());
        //after this line
    }

    public void removeItem() {
        items.removeLast();
        System.out.println("Consumer consuming, current size " + this.items.size());
        // Do some post-processing -> Fetch Accounts DB data and format it into required file
    }
}