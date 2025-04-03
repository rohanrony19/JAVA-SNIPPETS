package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.transportation.Transportation;
import com.xworkz.inheritence.internal.transportation.Train;

public class TransportationRunner {
    public static void main(String[] args) {
        Transportation transport = new Train();
        transport.move();
        transport.speed();
        transport.fuel();
        transport.capacity();
        transport.type();

        System.out.println("-----------");

        Train train = new Train();
        train.move();
        train.speed();
        train.fuel();
        train.capacity();
        train.type();
    }
}
