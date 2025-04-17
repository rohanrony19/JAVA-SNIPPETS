package com.xworkz.interfaces.rule;

public class Flower implements Carrot, Country, Connect, Collage, Chain {

    @Override
    public void isHealthy() {
        System.out.println("Flower: Carrot is healthy.");
    }

    @Override
    public void usedInSalad() {
        System.out.println("Flower: Carrot is used in salad.");
    }

    @Override
    public void hasVitaminA() {
        System.out.println("Flower: Carrot has Vitamin A.");
    }

    @Override
    public void lock() {
        System.out.println("Flower: Chain is locking.");
    }

    @Override
    public void wear() {
        System.out.println("Flower: Wearing the chain.");
    }

    @Override
    public void shine() {
        System.out.println("Flower: Chain is shining.");
    }

    @Override
    public void conductEvents() {
        System.out.println("Flower: Collage is conducting events.");
    }

    @Override
    public void provideHostel() {
        System.out.println("Flower: Collage is providing hostel.");
    }

    @Override
    public void manageDepartments() {
        System.out.println("Flower: Collage is managing departments.");
    }

    @Override
    public void establish() {
        System.out.println("Flower: Country is established.");
    }

    @Override
    public void maintain() {
        System.out.println("Flower: Country is being maintained.");
    }

    @Override
    public void terminate() {
        System.out.println("Flower: Country is terminated.");
    }

    @Override
    public void develop() {
        System.out.println("Flower: Country is developing.");
    }

    @Override
    public void maintainLaw() {
        System.out.println("Flower: Country is maintaining law.");
    }

    @Override
    public void representCulture() {
        System.out.println("Flower: Country is representing culture.");
    }

    @Override
    public void india() {
        System.out.println("Flower: Jesmine is Asshole");
    }
}
