package com.xworkz.interfaces.rule;

import java.beans.Visibility;

public class Case implements Vote, Visibility {

    @Override
    public void castVote() {
        System.out.println("Case: Casting your vote to make a difference.");
    }

    @Override
    public void verifyVoter() {
        System.out.println("Case: Verifying voter identity for a fair election.");
    }

    @Override
    public void countVote() {
        System.out.println("Case: Counting votes for accurate results.");
    }

    @Override
    public boolean needsGui() {
        System.out.println("Case: GUI is not necessary for this task.");
        return false;
    }

    @Override
    public void dontUseGui() {
        System.out.println("Case: Avoiding GUI as per the task requirement.");
    }

    @Override
    public void okToUseGui() {
        System.out.println("Case: GUI can be used when necessary.");
    }

    @Override
    public boolean avoidingGui() {
        System.out.println("Case: Avoiding GUI to maintain simplicity.");
        return false;
    }
}
