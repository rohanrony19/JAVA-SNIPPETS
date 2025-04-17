package com.xworkz.interfaces.rule;

public class Media implements Watch, Water, Window, Network, Mars {

    // Mars Interface Methods
    @Override
    public void isRedPlanet() {
        System.out.println("Media: Mars is the Red Planet.");
    }

    @Override
    public void hasDustStorms() {
        System.out.println("Media: Mars has frequent dust storms.");
    }

    @Override
    public void hasMountains() {
        System.out.println("Media: Mars has the largest volcano in the solar system.");
    }

    @Override
    public void planet() {
        System.out.println("Media: Running media");
    }

    // Network Interface Methods
    @Override
    public void connect() {
        System.out.println("Media: Connecting to the network.");
    }

    @Override
    public void transferData() {
        System.out.println("Media: Transferring data over the network.");
    }

    @Override
    public void disconnect() {
        System.out.println("Media: Disconnecting from the network.");
    }

    @Override
    public void speed() {
        System.out.println("Media:Runnnning");
    }

    // Watch Interface Methods
    @Override
    public void showTime() {
        System.out.println("Media: Showing the current time.");
    }

    @Override
    public void setAlarm() {
        System.out.println("Media: Setting the alarm.");
    }

    // Water Interface Methods
    @Override
    public void waterproof() {
        System.out.println("Media: The device is waterproof.");
    }

    @Override
    public void time() {
        System.out.println("Media: The people makes jokes for serious matter");
    }

    @Override
    public void drink() {
        System.out.println("Media: Drinking water.");
    }

    @Override
    public void boil() {
        System.out.println("Media: Boiling water.");
    }

    @Override
    public void flow() {
        System.out.println("Media: Water is flowing.");
    }

    @Override
    public void cost() {
        System.out.println("Media:Samay Raina got arrested");
    }

    // Window Interface Methods
    @Override
    public void open() {
        System.out.println("Media: Opening the window.");
    }

    @Override
    public void close() {
        System.out.println("Media: Closing the window.");
    }

    @Override
    public void allowAir() {
        System.out.println("Media: Allowing air through the window.");
    }

    @Override
    public void light() {
        System.out.println("Media:Due to latent show");
    }
}
