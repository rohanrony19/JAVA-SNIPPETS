package com.xworkz.Interface.Internal;

public class ShapeImpli implements Shape{

    public ShapeImpli(){
        System.out.println("No arg Constructor in ShapeImpli");
    }
    @Override
    public void draw() {
        System.out.println("overriding draw in shapeimpli");
    }
}
