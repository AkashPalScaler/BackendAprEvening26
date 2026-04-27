package AdderSubtractorSynchronized.AdderSubtractor;

import Inheritance.Student;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {
    SharedValue sval;
    Object random;
    Student std;

    public Subtractor(SharedValue sval, Object random, Student std) {
        this.sval = sval;
        this.random = random;
        this.std = std;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            // We might also be doing something
            synchronized (std)
            {
//                System.out.println("Subtractor " + i);
                sval.i -= i;
            }

            // We might also be doing something here
        }

        return null;
    }
}
