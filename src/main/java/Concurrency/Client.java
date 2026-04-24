package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //main thread starts
        System.out.println("Main function -> " + Thread.currentThread().getName());
        HelloWorldPrinter printer = new HelloWorldPrinter("Akash");
        Runnable r = new HelloWorldPrinter("Akash");
//        printer.run();
//        printer1.run();

        //Create a new thread and assign the task
        Thread thread = new Thread(printer); // Runnable task = new HelloWorldPrinter();
        thread.start();  // Run the task on the new thread

        // Print 1-100, each on new thread
//        for(int i=1;i<=1000000;i++){
//            Thread thread1 = new Thread(new NumberPrinter(i));
//            thread1.start();
//        }
        // Print 1-100, only on 10 threads using fixed thread pool
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=1000;i++){
//            Runnable r1 = new NumberPrinter(i);
//            es.execute(r1);
////
////            if(i==300){
////                System.out.println();
////            }
//        }

        // Print 1-100, only on 10 threads using cached thread pool
//        ExecutorService es1 = Executors.newCachedThreadPool();
//        for(int i=1;i<=1000000;i++){
//            Runnable r1 = new NumberPrinter(i);
//            es1.execute(r1);
//
//            if(i==600000){
//                System.out.println();
//            }
//        }



    }
}
// Class Thread{
//    public Thread(Runnable r){ }
//}