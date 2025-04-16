package com.xworkz.inheritancetypes.multi;

class File {
        void openFile() { System.out.println("Opening file"); }
    }

    class Document extends File {
        void readContent() { System.out.println("Reading document"); }
    }

    public class PDF extends Document {
        void secure() { System.out.println("PDF is secured");
    }

}
