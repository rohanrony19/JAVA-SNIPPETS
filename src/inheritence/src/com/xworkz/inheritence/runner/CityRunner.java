package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.city.City;
import com.xworkz.inheritence.internal.city.NewYork;

public class CityRunner {
    public static void main(String[] args) {
        City city = new NewYork();
        city.population();
        city.infrastructure();
        city.tourism();
        city.culture();
        city.economy();

        System.out.println("-----------");

        NewYork newYork = new NewYork();
        newYork.population();
        newYork.infrastructure();
        newYork.tourism();
        newYork.culture();
        newYork.economy();
    }
}
