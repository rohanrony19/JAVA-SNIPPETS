package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Never extends Book {
    private String name;
    private String category;
    private int price;

    public Never(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Never{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
