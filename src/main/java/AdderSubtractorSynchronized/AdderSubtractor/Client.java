package AdderSubtractorSynchronized.AdderSubtractor;

import Inheritance.Student;

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
        Object random = new Object();
        Student student = new Student();
        Future<Void> addFuture = es.submit(new Adder(sval, random,student));
        Future<Void> subFuture = es.submit(new Subtractor(sval,random,student));

        addFuture.get();// 6secs
        subFuture.get(); // 0sec

        System.out.println(sval.i);
    }
}
