package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SharedValue sval = new SharedValue();
        ReentrantLock lock = new ReentrantLock();

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Void> addFuture = es.submit(new Adder(sval, lock));
        Future<Void> subFuture = es.submit(new Subtractor(sval, lock));

        addFuture.get();// 6secs
        subFuture.get(); // 0sec

        System.out.println(sval.i);
    }
}
