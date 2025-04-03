package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.continent.Continent;
import com.xworkz.inheritence.internal.continent.Asia;

public class ContinentRunner {
    public static void main(String[] args) {
        Continent continent = new Asia();
        continent.countries();
        continent.population();
        continent.culture();
        continent.economy();
        continent.climate();

        System.out.println("-----------");

        Asia asia = new Asia();
        asia.countries();
        asia.population();
        asia.culture();
        asia.economy();
        asia.climate();
    }
}
