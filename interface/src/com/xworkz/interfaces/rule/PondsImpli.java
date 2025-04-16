package com.xworkz.interfaces.rule;

public class PondsImpli implements Ponds {
    @Override
    public void smoothSkin() {
        System.out.println("Skin is smooth");
    }

    @Override
    public void glow() {
        System.out.println("Glowing effect applied");
    }

    @Override
    public void freshFeel() {
        System.out.println("Feeling fresh");
    }
}
