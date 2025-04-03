package com.xworkz.inheritence.runner;


import com.xworkz.inheritence.internal.MusicInstrument.Guitar;
import com.xworkz.inheritence.internal.MusicInstrument.MusicInstrument;

public class MusicRunner {
    public static void main(String[] args) {
        MusicInstrument instrument=new Guitar();
        instrument.play();
        instrument.sound();
        instrument.type();
        instrument.maintenance();
        instrument.brand();

        System.out.println("-----------");

        Guitar guitar=new Guitar();
        guitar.play();
        guitar.sound();
        guitar.type();
        guitar.maintenance();
        guitar.brand();
    }
}
