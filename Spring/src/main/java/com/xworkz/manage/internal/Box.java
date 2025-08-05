package com.xworkz.manage.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Box {
  
    private String Tiffen;

    private String Metal;


    public Box(String Tiffen,String Metal){
        this.Tiffen = Tiffen;
        this.Metal=Metal;
        System.out.println("Box Constructor");
    }
}
