package com.xworkz.external;

import com.xworkz.Internal.Book;

public class BlueEyes extends Book {
    private String name;
    private String category;
    private int price;

    public BlueEyes(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "BlueEyes{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
