package com.xworkz.interfaces.rule;

public class Shell implements Carrot, Collage {

    @Override
    public void isHealthy() {
        System.out.println("Shell: Carrot is healthy, providing vitamin A.");
    }

    @Override
    public void usedInSalad() {
        System.out.println("Shell: Carrot is commonly used in salads.");
    }

    @Override
    public void hasVitaminA() {
        System.out.println("Shell: Carrot is rich in Vitamin A.");
    }

    @Override
    public void conductEvents() {
        System.out.println("Shell: College conducts events for students.");
    }

    @Override
    public void provideHostel() {
        System.out.println("Shell: College provides hostel facilities for students.");
    }

    @Override
    public void manageDepartments() {
        System.out.println("Shell: College manages various departments for academic growth.");
    }
}
