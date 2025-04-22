package com.xworkz.Interface.Internal;

public class DatabaseImpli implements Database{
    public DatabaseImpli(){
        System.out.println("No arg constructor in databaseimppli");
    }

    @Override
    public void connect() {
        System.out.println("overriding connect in databaseimpli");
    }
}
