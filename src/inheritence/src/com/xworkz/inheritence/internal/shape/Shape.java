package com.xworkz.inheritence.internal.shape;

public class Shape {
    public Shape() {
        System.out.println("Running non-arg constructor Shape");
    }
    public void draw() {
        System.out.println("Drawing a shape");
    }
    public void area() {
        System.out.println("Calculating area of shape");
    }
    public void perimeter() {
        System.out.println("Calculating perimeter of shape");
    }
    public void color() {
        System.out.println("Shapes can have different colors");
    }
    public void dimension() {
        System.out.println("Shapes have dimensions");
    }
}
