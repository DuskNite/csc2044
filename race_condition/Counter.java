package com.company;

/**
 * Created by juan on 12/04/2017.
 */
public class Counter {

    private int value;

    public Counter(int c) {
        value =  c;
    }

    public void set(int c) {
        value = c;
    }

    public int get() {
        return value;
    }

    public void inc() {
        value++;
    }
}
