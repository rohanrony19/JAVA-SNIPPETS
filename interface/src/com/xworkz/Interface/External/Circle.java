package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.Shape;

public class Circle {
    private Shape shape;

    public Circle(Shape shape){
        this.shape=shape;
        System.out.println("Assigning shape instance ");
    }
    public void paint(){
        if(this.shape!=null){
            this.shape.draw();
            System.out.println("Running paint in circle");
        }else{
            System.out.println("Null");
        }
    }
}
