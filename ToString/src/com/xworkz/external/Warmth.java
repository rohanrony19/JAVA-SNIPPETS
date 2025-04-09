package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Warmth extends Book {
    private String name;
    private String category;
    private int price;

    public Warmth(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Warmth{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
