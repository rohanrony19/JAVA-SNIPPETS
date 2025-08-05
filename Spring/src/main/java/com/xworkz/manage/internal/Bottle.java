package com.xworkz.manage.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.EntityManagerFactoryAccessor;
import org.springframework.stereotype.Component;

@Component
public class Bottle {


    @Autowired
    Cap cap;

    @Autowired
    String mail;//shriharshaKm10@gmail.com

    @Autowired
    String mali2;//shriharshaKm10@gmail.com
    public Bottle(){
        System.out.println("running bottle const");
    }
}
