package com.xworkz.external;

import com.xworkz.Internal.Book;

public class KissMe extends Book {
    private String name;
    private String category;
    private int price;

    public KissMe(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "KissMe{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
