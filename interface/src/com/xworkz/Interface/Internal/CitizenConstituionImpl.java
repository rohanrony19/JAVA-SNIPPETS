package com.xworkz.Interface.Internal;

public class CitizenConstituionImpl implements Constitution{

    public CitizenConstituionImpl(){
        System.out.println("NO arg Constructor CitizenConstituionImpl");
    }
    @Override
    public void followLaws() {
        System.out.println("override followlaws in CitizenConstituionImpl");
    }
}
