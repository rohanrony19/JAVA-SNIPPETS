package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Newstart extends Book {
    private String name;
    private String category;
    private int price;

    public Newstart(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Newstart{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
