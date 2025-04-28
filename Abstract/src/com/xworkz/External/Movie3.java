package com.xworkz.External;

public abstract class Movie3 {
    public String name;
    public int distance;
    public char star ;

    public Movie3(String name, int distance,char grade) {
        this.distance = distance;
        this.name = name;
        this.star = star;
    }

    public void plan3() {
    }

    public String toString() {
        return "[ Distance: " + this.distance + " Name: " + this.name + " Grade:" + this.star + "]";
    }
}
