package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.shape.Shape;
import com.xworkz.inheritence.internal.shape.Circle;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.area();
        shape.perimeter();
        shape.color();
        shape.dimension();

        System.out.println("------------------");
        Circle circle=new Circle();
        circle.draw();
        circle.area();
        circle.perimeter();
        circle.color();
        circle.dimension();
    }
}
