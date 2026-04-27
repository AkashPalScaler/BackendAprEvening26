package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Callable<Void> {
    SharedValue sval;
    ReentrantLock lock;

    public Adder(SharedValue sval, ReentrantLock lock) {
        this.sval = sval;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            lock.lock();
            System.out.println("Adder " + i);
            sval.i += i;
            lock.unlock();
        }
        return null;
    }
}
