package com.xworkz.Interface.Internal;

public class SocialMediaImpli implements SocialMedia{

    public SocialMediaImpli(){
        System.out.println("No arg constructor SocialMedia");
    }
    @Override
    public void Instagram() {
        System.out.println("Overriding Instagram in Socialmediaimpli");
    }
}
