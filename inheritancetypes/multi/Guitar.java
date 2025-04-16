package com.xworkz.inheritancetypes.multi;

class Instrument {
        void playInstrument() { System.out.println("Playing instrument"); }
    }

    class StringInstrument extends Instrument {
        void tuneStrings() { System.out.println("Tuning strings"); }
    }

public class Guitar extends StringInstrument {
        void strum() { System.out.println("Strumming guitar");
    }
}
