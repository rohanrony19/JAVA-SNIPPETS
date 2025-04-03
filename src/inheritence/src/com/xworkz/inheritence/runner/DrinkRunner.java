package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.drink.Drink;
import com.xworkz.inheritence.internal.drink.Juice;

public class DrinkRunner {
    public static void main(String[] args) {
        Drink drink = new Juice();
        drink.sip();
        drink.refresh();
        drink.cold();
        drink.sweet();
        drink.healthy();

        System.out.println("--------");
        Juice juice=new Juice();
        juice.sip();
        juice.refresh();
        juice.cold();
        juice.sweet();
        juice.healthy();

    }
}
