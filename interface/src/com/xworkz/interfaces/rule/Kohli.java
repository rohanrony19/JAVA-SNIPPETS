package com.xworkz.interfaces.rule;

public class Kohli implements HM, Home, Hospital, Hotspot, Kid {

    // HM Interface Methods
    @Override
    public void design() {
        System.out.println("Kohli: Designing a new trend for the house.");
    }

    @Override
    public void trend() {
        System.out.println("Kohli: Following the latest trends in home design.");
    }

    @Override
    public void sell() {
        System.out.println("Kohli: Selling home designs to clients.");
    }

    // Home Interface Methods
    @Override
    public void slipperOutSide() {
        System.out.println("Kohli: Slippers are outside the house.");
    }

    @Override
    public void sleepEarly() {
        System.out.println("Kohli: Sleeping early for a fresh start.");
    }

    // Kid Interface Methods
    @Override
    public boolean speakLoud() {
        System.out.println("Kohli: Does the kid speak loudly? " + false);
        return false; // Returning false, you could modify this logic depending on the condition
    }

    @Override
    public void play() {
        System.out.println("Kohli: Playing games with the kid.");
    }

    @Override
    public void learn() {
        System.out.println("Kohli: Learning new things from the kid.");
    }

    @Override
    public void eat() {
        System.out.println("Kohli: Eating healthy food with the kid.");
    }

    @Override
    public void child() {
        System.out.println("Kohli: Kohli is fucking anushka");
    }

    // Hospital Interface Methods
    @Override
    public void admitPatient() {
        System.out.println("Kohli: Admitting a new patient.");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Kohli: Providing treatment to the patient.");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Kohli: Discharging the patient after recovery.");
    }

    // Hotspot Interface Methods
    @Override
    public void turnOn() {
        System.out.println("Kohli: Turning on the hotspot.");
    }

    @Override
    public void connectDevice() {
        System.out.println("Kohli: Connecting device to the hotspot.");
    }

    @Override
    public void turnOff() {
        System.out.println("Kohli: Turning off the hotspot.");
    }
}
