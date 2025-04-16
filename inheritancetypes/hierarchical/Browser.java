package com.xworkz.inheritancetypes.hierarchical;

public class Browser {
        void open() { System.out.println("Opening browser"); }
    }

    class Chrome extends Browser {
        void sync() { System.out.println("Syncing Chrome settings"); }
    }

    class Firefox extends Browser {
        void customize() { System.out.println("Customizing Firefox"); }
    }

    class Edge extends Browser {
        void integrate() { System.out.println("Integrating with Windows");
    }

}
