package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.suitcase.Suitcase;
import com.xworkz.inheritence.internal.suitcase.Zip;

public class SuitcaseRunner {
    public static void main(String[] args) {
        Suitcase suitcase=new Zip();
        suitcase.close();
        suitcase.color();
        suitcase.noOfZip();
        suitcase.open();
        suitcase.small();

        System.out.println("-----------");
        Zip zip=new Zip();
        zip.close();
        zip.color();
        zip.noOfZip();
        zip.open();
        zip.small();


    }
}
