package AdderSubtractorSynchronized.AdderSubtractor;

import Inheritance.Student;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Callable<Void> {
    SharedValue sval;
    Object random;
    Student std;

    public Adder(SharedValue sval,Object random, Student std) {
        this.sval = sval;
        this.random = random;
        this.std = std;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            synchronized (std) { // std.internalLock.lock()
//                System.out.println("Adder " + i);
                sval.i += i;
            } // sval.internalLock.unlock()
        }
        return null;
    }
}
