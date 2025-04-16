package com.xworkz.inheritancetypes.hierarchical;

public class Tool {
        void use() { System.out.println("Using a tool"); }
    }

    class Hammer extends Tool {
        void hit() { System.out.println("Hammering nails"); }
    }

    class Wrench extends Tool {
        void tighten() { System.out.println("Tightening bolt"); }
    }

    class Screwdriver extends Tool {
        void screw() { System.out.println("Screwing screw");
    }
}
