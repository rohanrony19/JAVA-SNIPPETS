package com.xworkz.interfaces.rule;

public class CountryImpli implements Country {
    @Override
    public void develop() {
        System.out.println("Country is developing");
    }

    @Override
    public void maintainLaw() {
        System.out.println("Country is maintaining law and order");
    }

    @Override
    public void representCulture() {
        System.out.println("Country represents its culture");
    }

    @Override
    public void india() {
        System.out.println("country is India");
    }
}
