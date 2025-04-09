package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SoulMate extends Book {
    private String name;
    private String category;
    private int price;

    public SoulMate(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "SoulMate{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
