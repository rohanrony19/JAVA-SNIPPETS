package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OnlyYou extends Book {
    private String name;
    private String category;
    private int price;

    public OnlyYou(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "OnlyYou{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
