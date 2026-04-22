package Concurrency;

import Inheritance.Student;

public class HelloWorldPrinter implements Runnable{
    String name;

    public HelloWorldPrinter(String name) {
        this.name = name;
    }

    @Override
    public void run() { // Entry point for a thread
        System.out.println("Hello World -> "+ name + Thread.currentThread().getName());
        somthing();
    }

    public void somthing(){
        System.out.println("Something ->" + Thread.currentThread().getName());
    }
}
