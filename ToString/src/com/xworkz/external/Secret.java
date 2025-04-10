package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Secret extends Book {
    private String name;
    private String category;
    private int price;

    public Secret(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Secret{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
