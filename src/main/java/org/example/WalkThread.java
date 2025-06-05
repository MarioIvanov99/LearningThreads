package org.example;

public class WalkThread implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": Walking " + (i+1));
        }
    }
}