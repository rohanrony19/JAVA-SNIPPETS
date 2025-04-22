package com.xworkz.Interface.Internal;

public class CollegeImpli implements College{
    public CollegeImpli(){
        System.out.println("No arg constructor");
    }
    @Override
    public void students() {
        System.out.println("Overriding students in Collegeimpli");
    }
}
