package com.xworkz.interfaces.rule;

public class DollarImpli implements Dollar {
    @Override
    public void exchange() {
        System.out.println("Dollar exchanged");
    }

    @Override
    public void convert() {
        System.out.println("Dollar converted to INR");
    }

    @Override
    public void value() {
        System.out.println("Dollar has high value");
    }

    @Override
    public void money() {
        System.out.println("dollar is money");
    }
}
