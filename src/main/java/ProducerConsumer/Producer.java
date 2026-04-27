package ProducerConsumer;

public class Producer implements Runnable{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run(){
        while(true) {
            synchronized (store){
                if (store.getItems().size() < store.getMaxSize()) { // if any empty shelf is there
                    store.addItem();
                }
            }

        }
    }
}
// Break till - 8:27 AM