package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.furniture.Furniture;
import com.xworkz.inheritence.internal.furniture.Chair;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Chair();
        furniture.support();
        furniture.material();
        furniture.weight();
        furniture.move();
        furniture.design();

        System.out.println("-----------");

        Chair chair = new Chair();
        chair.support();
        chair.material();
        chair.weight();
        chair.move();
        chair.design();
    }
}
