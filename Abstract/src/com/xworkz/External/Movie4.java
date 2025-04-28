package com.xworkz.External;

public abstract class Movie4 {
    public int distance;
    public String name;
    public char star;
    public int amount;

    public Movie4(int distance, String name, char star) {
        this.distance = distance;
        this.star = star;
        this.name = name;
    }

    public void plan4() {
        System.out.println("Name: " + this.name + " Grade: " + this.star + " Distance: " + this.distance);
    }

    public String toString() {
        return "[Name: " + this.name + "Grade: " + this.star + " Distance: " + this.distance + "]";
    }
}
