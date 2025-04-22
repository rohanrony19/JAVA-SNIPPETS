package com.xworkz.Interface.Internal;

public class IndianCricketTeamIccImpl implements Icc{
    public IndianCricketTeamIccImpl(){
        System.out.println("No args Constructor IndianCricketTeamIccImpl");
    }
    @Override
    public void fairPlay() {
        System.out.println("overriding FairPlay in IndianCricketTeamIccImp ");

    }
}
