package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new Talkative(i));
            threads.add(new Thread(() -> thread.run()));
        }


        for (Thread thread : threads)
            thread.start();
    }
}