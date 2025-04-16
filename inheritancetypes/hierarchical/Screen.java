package com.xworkz.inheritancetypes.hierarchical;

public class Screen {
        void display() { System.out.println("Displaying on screen"); }
    }

    class PhoneScreen extends Screen {
        void touch() { System.out.println("Touch input enabled"); }
    }

    class TVScreen extends Screen {
        void stream() { System.out.println("Streaming video"); }
    }

    class MonitorScreen extends Screen {
        void refresh() { System.out.println("Refreshing monitor display");
    }
}
