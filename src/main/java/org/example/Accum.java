package org.example;

public class Accum {
    private static Accum a = new Accum();
    private int counter = 0;

    Accum() {
    }

    public static Accum getAccum() {
        return a;
    }

    public int getCount() {
        return counter;
    }

    public void updateCounter(int add) {
        counter += add;
    }
}
