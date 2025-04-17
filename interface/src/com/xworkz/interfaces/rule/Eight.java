package com.xworkz.interfaces.rule;

public class Eight implements Collage, Chair, Connect, Country, God {

    @Override
    public void sitOn() {
        System.out.println("Eight: Sitting on the chair.");
    }

    @Override
    public void hasLegs() {
        System.out.println("Eight: Chair has four legs.");
    }

    @Override
    public void isComfortable() {
        System.out.println("Eight: Chair is comfortable to sit.");
    }

    @Override
    public void conductEvents() {
        System.out.println("Eight: Collage is conducting annual events.");
    }

    @Override
    public void provideHostel() {
        System.out.println("Eight: Collage provides hostel facilities.");
    }

    @Override
    public void manageDepartments() {
        System.out.println("Eight: Collage is managing academic departments.");
    }

    @Override
    public void establish() {
        System.out.println("Eight: Connect established a strong relationship.");
    }

    @Override
    public void maintain() {
        System.out.println("Eight: Connection is being maintained.");
    }

    @Override
    public void terminate() {
        System.out.println("Eight: Connection has been terminated.");
    }

    @Override
    public void develop() {
        System.out.println("Eight: Country is developing rapidly.");
    }

    @Override
    public void maintainLaw() {
        System.out.println("Eight: Country is maintaining law and order.");
    }

    @Override
    public void representCulture() {
        System.out.println("Eight: Country represents diverse culture.");
    }

    @Override
    public void india() {
        System.out.println("Eight:Country represents the people");
    }

    @Override
    public void bless() {
        System.out.println("Eight: God blesses all beings.");
    }

    @Override
    public void forgive() {
        System.out.println("Eight: God forgives sins.");
    }

    @Override
    public void guide() {
        System.out.println("Eight: God guides people through difficulties.");
    }
}
