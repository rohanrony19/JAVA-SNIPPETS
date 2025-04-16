package com.xworkz.interfaces.rule;

public class VoteImpli implements Vote {
    @Override
    public void castVote() {
        System.out.println("Vote is casted");
    }

    @Override
    public void verifyVoter() {
        System.out.println("Voter is verified");
    }

    @Override
    public void countVote() {
        System.out.println("Votes are being counted");
    }
}
