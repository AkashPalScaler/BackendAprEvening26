package Concurrency;

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

    }
}
// Class Thread{
//    public Thread(Runnable r){ }
//}