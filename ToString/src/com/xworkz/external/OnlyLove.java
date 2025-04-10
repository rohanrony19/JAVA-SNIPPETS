package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OnlyLove extends Book {
    private String name;
    private String category;
    private int price;

    public OnlyLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "OnlyLove{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
