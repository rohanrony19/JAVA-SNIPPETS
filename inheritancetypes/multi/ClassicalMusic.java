package com.xworkz.inheritancetypes.multi;

 class Media {
        void play() { System.out.println("Playing media"); }
    }

    class Music extends Media {
        void listen() { System.out.println("Listening to music"); }
    }

public  class ClassicalMusic extends Music {
        void relax() { System.out.println("Relaxing with classical music"); }
}
