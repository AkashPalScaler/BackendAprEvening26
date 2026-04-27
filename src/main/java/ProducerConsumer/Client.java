package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);

        //8 threads constantly trying to produce item
        //8 threads are running -> each one having a producer
        for(int i = 1; i<=8; ++i){
            ex.execute(new Producer(store));
        }
        // 3 thread constantly trying to remove item
        for(int i = 1 ; i <= 3; ++i){
            ex.execute(new Consumer(store));
        }
    }
}
