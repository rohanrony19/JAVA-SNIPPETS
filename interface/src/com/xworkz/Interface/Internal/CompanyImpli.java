package com.xworkz.Interface.Internal;

public class CompanyImpli implements Company{
    public CompanyImpli(){
        System.out.println("NO arg constructor CompanyImpli");
    }
    @Override
    public void Employee() {
        System.out.println("Overiding Employee in CompanyImpli");
    }
}
