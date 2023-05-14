package org.example;

public class Talkative implements Runnable{
    private int number;

    public Talkative(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++)
            System.out.println("Hello World! " + i + " from Talkative " + this.number);
    }
}
