package com.xworkz.inheritancetypes.hierarchical;

public class Beverage {
        void serve() { System.out.println("Serving beverage"); }
    }

    class Tea extends Beverage {
        void addMilk() { System.out.println("Adding milk to tea"); }
    }

    class Coffee extends Beverage {
        void brew() { System.out.println("Brewing coffee"); }
    }

    class Juice extends Beverage {
        void squeeze() { System.out.println("Squeezing juice");
    }
}
