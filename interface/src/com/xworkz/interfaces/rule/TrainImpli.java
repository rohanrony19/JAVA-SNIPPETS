package com.xworkz.interfaces.rule;

public class TrainImpli implements Train {
    @Override
    public void run() {
        System.out.println("Train is running");
    }

    @Override
    public void stop() {
        System.out.println("Train has stopped");
    }

    @Override
    public void horn() {
        System.out.println("Train horn is loud");
    }

    @Override
    public void big() {
        System.out.println("big");
    }
}
