package com.xworkz.interfaces.rule;

public class BjpImpli implements Bjp {
    @Override
    public void winElection() {
        System.out.println("BJP won the election");
    }

    @Override
    public void makeSpeech() {
        System.out.println("BJP leader giving a speech");
    }

    @Override
    public void launchScheme() {
        System.out.println("BJP launched a new scheme");
    }

    @Override
    public void party() {
        System.out.println("bjp is a party");
    }
}
