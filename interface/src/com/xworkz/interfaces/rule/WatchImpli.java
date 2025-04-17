package com.xworkz.interfaces.rule;

public class WatchImpli implements Watch {
    @Override
    public void showTime() {
        System.out.println("Watch shows time");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm is set on watch");
    }

    @Override
    public void waterproof() {
        System.out.println("Watch is waterproof");
    }

    @Override
    public void time() {
        System.out.println("watch to check time");
    }
}
