package com.xworkz.interfaces.rule;

public class GoldImpli implements Gold {
    @Override
    public void shine() {
        System.out.println("Gold shines brightly");
    }

    @Override
    public void isExpensive() {
        System.out.println("Gold is expensive");
    }

    @Override
    public void usedForJewellery() {
        System.out.println("Gold is used for jewellery");
    }

    @Override
    public void rate() {
        System.out.println("gold rate");
    }
}
