package com.xworkz.interfaces.rule;

public class LotionImpli implements Lotion {
    @Override
    public void apply() {
        System.out.println("Lotion applied");
    }

    @Override
    public void protectSkin() {
        System.out.println("Skin protected");
    }

    @Override
    public void moisturize() {
        System.out.println("Skin moisturized");
    }

    @Override
    public void a() {
        System.out.println("a");
    }
}
