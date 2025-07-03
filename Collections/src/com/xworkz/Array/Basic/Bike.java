package com.xworkz.Array.Basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Bike {
    public static void main(String[] args) {
        Collection<String> bike = new ArrayList<>();
        bike.add("R15");
        bike.add("Ninja");
        bike.add("Traump");
        bike.add("RS400");
        System.out.println("Bike Size :" + bike.size() );
        bike.clear();
        System.out.println("Delete bike size :" + bike.size());
        bike.add("R15");
        bike.add("Ninja");
        bike.add("Traump");
        bike.add("RS400");
        System.out.println("Bike Size :" + bike.size() );
        System.out.println();

        Set<String> car = new HashSet<>();
        car.add("Lamborghini");
        car.add("Skoda");
        car.add("Ferrari");
        car.add("BMW");
        car.add("Dodge");
        System.out.println("Car Collections : " +car.size());
        System.out.println(car);

    }
}
