package Lambdas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Runnable task = new HelloWorldPrinter();
        Thread t1 = new Thread(task);
        t1.start();
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.submit(task);
        // placing order
        // child thread -> processed on separare thread -> logs are pushed into files or pushed into log db like loki innodb // this takes time
        // order sent to market place
        // child thread -> processed on separare thread -> logs are pushed into files or pushed into log db like loki innodb // this takes time
        // order confirmation from market place

        // Anonymous(no name) class
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });
        t2.start();


        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2!");
            }
        };

        TestInterface testObj1 = new TestInterface() {
            @Override
            public void run() {
                System.out.println("Hello run");
            }

            @Override
            public void something(int i) {
                System.out.println("Print some number "  + i);
            }
        };
        testObj1.something(10);

        System.out.println("Debug");

        // Lambdas
        Runnable task3 = () -> {
            System.out.println("Hello World 2!");
        };
        // Left = right; | func(left ref).....func(right)

        // Logger
        es.submit(() -> {System.out.println("Hello World 2!");}); // runnable
        es.submit(() -> { return 10;}); // callable

        // Break till 10:25

    }
}
