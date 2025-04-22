package com.xworkz.Interface.Internal;

public class MovieImpli implements Movie{
    public MovieImpli(){
        System.out.println("No arg constructor Movieimpli");
    }

    @Override
    public void shooting() {
        System.out.println("overiding shooting in movieimpli");
    }
}

