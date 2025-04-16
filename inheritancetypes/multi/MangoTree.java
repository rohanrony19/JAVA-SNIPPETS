package com.xworkz.inheritancetypes.multi;

class Plant {
        void grow() { System.out.println("Plant is growing"); }
    }

    class Tree extends Plant {
        void giveShade() { System.out.println("Tree provides shade"); }
    }

public class MangoTree extends Tree {
        void bearFruit() { System.out.println("Mango tree bears fruit");
    }
}
