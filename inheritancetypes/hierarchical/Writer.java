package com.xworkz.inheritancetypes.hierarchical;

public class Writer {
        void write() { System.out.println("Writing content"); }
    }

    class Poet extends Writer {
        void compose() { System.out.println("Composing poem"); }
    }

    class Novelist extends Writer {
        void narrate() { System.out.println("Narrating a novel"); }
    }

    class Journalist extends Writer {
        void report() { System.out.println("Reporting news");
    }

}
