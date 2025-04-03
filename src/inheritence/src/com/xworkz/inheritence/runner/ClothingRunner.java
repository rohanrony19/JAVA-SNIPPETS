package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.clothing.Clothing;
import com.xworkz.inheritence.internal.clothing.TShirt;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing = new TShirt();
        clothing.wear();
        clothing.material();
        clothing.size();
        clothing.brand();
        clothing.design();

        System.out.println("-----------");

        TShirt tShirt = new TShirt();
        tShirt.wear();
        tShirt.material();
        tShirt.size();
        tShirt.brand();
        tShirt.design();
    }
}
