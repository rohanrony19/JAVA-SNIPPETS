package com.xworkz.interfaces.rule;

public class Mac implements India, Airoplain, Engine, Carrot, University {

    @Override
    public void fly() {
        System.out.println("Mac: Airplane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Mac: Airplane is landing.");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Mac: Airplane is carrying passengers.");
    }

    @Override
    public void isHealthy() {
        System.out.println("Mac: Carrot is healthy.");
    }

    @Override
    public void usedInSalad() {
        System.out.println("Mac: Carrot is used in salad.");
    }

    @Override
    public void hasVitaminA() {
        System.out.println("Mac: Carrot has Vitamin A.");
    }

    @Override
    public void start() {
        System.out.println("Mac: Engine is starting.");
    }

    @Override
    public void consumeFuel() {
        System.out.println("Mac: Engine is consuming fuel.");
    }

    @Override
    public void stop() {
        System.out.println("Mac: Engine is stopping.");
    }

    @Override
    public void showCulture() {
        System.out.println("Mac: Showing the culture of India.");
    }

    @Override
    public void celebrateFestival() {
        System.out.println("Mac: Celebrating a festival in India.");
    }

    @Override
    public void growEconomy() {
        System.out.println("Mac: India is growing its economy.");
    }

    @Override
    public void conductExam() {
        System.out.println("Mac: Conducting exams at the University.");
    }

    @Override
    public void publishResults() {
        System.out.println("Mac: Publishing exam results.");
    }

    @Override
    public void grantDegrees() {
        System.out.println("Mac: Granting degrees to students.");
    }
}
