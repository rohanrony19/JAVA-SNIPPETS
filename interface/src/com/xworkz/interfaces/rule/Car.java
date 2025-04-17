package com.xworkz.interfaces.rule;

public class Car implements Pluto, Ponds {

    @Override
    public void revolve() {
        System.out.println("Car revolves around the city like Pluto around the sun.");
    }

    @Override
    public void rotate() {
        System.out.println("Car rotates its wheels to move forward.");
    }

    @Override
    public void hasIce() {
        System.out.println("Car's AC can make the cabin feel icy like Pluto.");
    }

    @Override
    public void planet() {
        System.out.println("Pluto: Running pluto");
    }

    @Override
    public void smoothSkin() {
        System.out.println("Car has a smooth polished surface like soft skin.");
    }

    @Override
    public void glow() {
        System.out.println("Car glows under street lights after a good wash.");
    }

    @Override
    public void freshFeel() {
        System.out.println("Car gives a fresh feel with its fragrance inside.");
    }

    @Override
    public void cream() {
        System.out.println("Ponds: Running Ponds");
    }
}
