package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.country.Country;
import com.xworkz.inheritence.internal.country.India;

public class CountryRunner {
    public static void main(String[] args) {
        Country country = new India();
        country.name();
        country.population();
        country.culture();
        country.economy();
        country.government();

        System.out.println("-----------");
        India india=new India();
        india.name();
        india.population();
        india.culture();
        india.economy();
        india.government();


    }
}
