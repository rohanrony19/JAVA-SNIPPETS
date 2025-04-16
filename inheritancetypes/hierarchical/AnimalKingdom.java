package com.xworkz.inheritancetypes.hierarchical;

public class AnimalKingdom {
        void survive() { System.out.println("Surviving in the wild"); }
    }

    class Lion extends AnimalKingdom {
        void roar() { System.out.println("Roaring lion"); }
    }

    class Tiger extends AnimalKingdom {
        void growl() { System.out.println("Growling tiger"); }
    }

    class Leopard extends AnimalKingdom {
        void leap() { System.out.println("Leaping leopard");
    }
}
