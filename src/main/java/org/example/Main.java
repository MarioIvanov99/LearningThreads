package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("main start");
        TalkThread talk = new TalkThread();
        talk.start();
        System.out.println("main ended!");
    }
}