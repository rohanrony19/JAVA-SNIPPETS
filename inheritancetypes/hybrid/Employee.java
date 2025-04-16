package com.xworkz.inheritancetypes.hybrid;



interface TaxPayer {
    void payTax();
}

interface Driver {
    void drive();
}

class Person {
    void breathe() { System.out.println("Person is breathing"); }
}

public class Employee extends Person implements TaxPayer, Driver {
    public void payTax() { System.out.println("Employee paying tax"); }
    public void drive() { System.out.println("Employee driving");
}
}
