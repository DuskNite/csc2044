package com.company;

/**
 * Created by juan on 12/04/2017.
 */
public class IncrementTask implements Runnable {

    private Counter counter;

    public IncrementTask(Counter c) {
        counter = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            counter.inc();
        }
    }
}
