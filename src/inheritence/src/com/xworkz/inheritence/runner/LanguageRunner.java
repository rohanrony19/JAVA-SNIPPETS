package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.language.Language;
import com.xworkz.inheritence.internal.language.Java;

public class LanguageRunner {
    public static void main(String[] args) {
        Language lang = new Java();
        lang.speak();
        lang.write();
        lang.communicate();
        lang.grammar();
        lang.origin();

        System.out.println("-----------");
        Java java=new Java();
        java.speak();
        java.write();
        java.communicate();
        java.grammar();
        java.origin();


    }
}
