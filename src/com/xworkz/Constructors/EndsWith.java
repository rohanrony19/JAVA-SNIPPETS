package com.xworkz.Constructors;

public class EndsWith {
        public static void endsWith(String[] countries){
            for (String country: countries){
                if(country.endsWith("A")|| country.endsWith("a")){
                    System.out.println(country);
                }
            }

        }
    }

