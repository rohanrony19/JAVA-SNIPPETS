package com.xworkz.manage.internal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cap {

    public Cap(){
        System.out.println("running cap by spring");
    }

    @Autowired
    @Qualifier("Tiffen")
    private String Tiffen;

    @Autowired
    public String Metal;

//    @Autowired
//    public Box box;


}
