package com.company;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter(0);
        IncrementTask task1 = new IncrementTask(counter);
        IncrementTask task2 = new IncrementTask(counter);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        System.out.println("in thread: " + Thread.currentThread().getName());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Value of counter is: " + counter.get());
    }
}
