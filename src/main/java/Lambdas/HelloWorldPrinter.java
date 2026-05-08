package Lambdas;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("hello world");
    }
}

//I want to just print one line on a diff thread
// A simple one line log statement needs to be run on separate thread , there is no reusability
// Problem - Extra work of creating a class and class explosion