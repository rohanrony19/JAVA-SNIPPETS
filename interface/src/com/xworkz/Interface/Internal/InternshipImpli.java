package com.xworkz.Interface.Internal;

public class InternshipImpli implements Internship{

    public InternshipImpli(){
        System.out.println("No arg Constructor Internship");
    }
    @Override
    public void stipend() {
        System.out.println("overriding stipend in intershipimpli");
    }
}
