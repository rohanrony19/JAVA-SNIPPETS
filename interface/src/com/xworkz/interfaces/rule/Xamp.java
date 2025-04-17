package com.xworkz.interfaces.rule;

public class Xamp implements Temple, Trolley, Train, Teachers, Tomato {

    @Override
    public void teach() {
        System.out.println("Xamp: Teachers are teaching students.");
    }

    @Override
    public void evaluate() {
        System.out.println("Xamp: Teachers are evaluating exams.");
    }

    @Override
    public void guideStudents() {
        System.out.println("Xamp: Teachers are guiding students in projects.");
    }

    @Override
    public void openGate() {
        System.out.println("Xamp: Temple gates are open.");
    }

    @Override
    public void performPuja() {
        System.out.println("Xamp: Puja is being performed at the temple.");
    }

    @Override
    public void ringBell() {
        System.out.println("Xamp: Bell is ringing in the temple.");
    }

    @Override
    public void isRed() {
        System.out.println("Xamp: Tomato is red in color.");
    }

    @Override
    public void juicy() {
        System.out.println("Xamp: Tomato is juicy.");
    }

    @Override
    public void usedInCurry() {
        System.out.println("Xamp: Tomato is used in curry for flavor.");
    }

    @Override
    public void run() {
        System.out.println("Xamp: Train is running on tracks.");
    }

    @Override
    public void stop() {
        System.out.println("Xamp: Train has stopped at the station.");
    }

    @Override
    public void horn() {
        System.out.println("Xamp: Train horn is blowing.");
    }

    @Override
    public void roll() {
        System.out.println("Xamp: Trolley is rolling smoothly.");
    }

    @Override
    public void carry() {
        System.out.println("Xamp: Trolley is carrying items.");
    }

    @Override
    public void store() {
        System.out.println("Xamp: Trolley is used to store luggage.");
    }
}
