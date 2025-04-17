package com.xworkz.interfaces.rule;

public class Canon implements India, Airoplain, AC {

    @Override
    public void coolRoom() {
        System.out.println("Canon: Cooling the room.");
    }

    @Override
    public void setTemperature() {
        System.out.println("Canon: Setting the temperature.");
    }

    @Override
    public void swing() {
        System.out.println("Canon: Swinging the AC.");
    }

    @Override
    public void fly() {
        System.out.println("Canon: The airplane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Canon: The airplane is landing.");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Canon: Carrying passengers.");
    }

    @Override
    public void costly() {
        System.out.println("Airoplain:Running Aeroplain");
    }

    @Override
    public void showCulture() {
        System.out.println("Canon: Showing India's culture.");
    }

    @Override
    public void celebrateFestival() {
        System.out.println("Canon: Celebrating festival in India.");
    }

    @Override
    public void growEconomy() {
        System.out.println("Canon: Growing the economy of India.");
    }

    @Override
    public void country() {
        System.out.println("India: India is beautiful");
    }
}
