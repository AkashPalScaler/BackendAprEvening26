package ProducerConsumerWithSemaphore.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    Semaphore prodSema;
    Semaphore consSema;

    public Producer(Store store, Semaphore prodSema, Semaphore consSema) {
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }

    @Override
    public void run(){
        while(true) {
            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consSema.release();
        }
    }
}
// Break till - 8:27 AM