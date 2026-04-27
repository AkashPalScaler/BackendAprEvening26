package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {
    SharedValue sval;
    ReentrantLock lock;

    public Subtractor(SharedValue sval, ReentrantLock lock) {
        this.sval = sval;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            // We might also be doing something
            lock.lock();
            System.out.println("Subtractor " + i);
            sval.i -= i;
            lock.unlock();
            // We might also be doing something here
        }

        return null;
    }
}
