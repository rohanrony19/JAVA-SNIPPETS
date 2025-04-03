package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.river.River;
import com.xworkz.inheritence.internal.river.Nile;

public class RiverRunner {
    public static void main(String[] args) {
        River river = new Nile();
        river.length();
        river.origin();
        river.flows();
        river.providesWater();
        river.wildlife();

        System.out.println("-----------");

        Nile nile = new Nile();
        nile.length();
        nile.origin();
        nile.flows();
        nile.providesWater();
        nile.wildlife();
    }
}
