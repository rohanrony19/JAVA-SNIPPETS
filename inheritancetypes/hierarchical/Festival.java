package com.xworkz.inheritancetypes.hierarchical;

public class Festival {
        void celebrate() { System.out.println("Celebrating festival"); }
    }

    class Diwali extends Festival {
        void lightLamps() { System.out.println("Lighting lamps on Diwali"); }
    }

    class Holi extends Festival {
        void throwColors() { System.out.println("Throwing colors on Holi"); }
    }

    class Christmas extends Festival {
        void gift() { System.out.println("Exchanging gifts on Christmas");
    }
}
