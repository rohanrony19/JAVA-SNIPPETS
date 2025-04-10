package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Founduh extends Book {
    private String name;
    private String category;
    private int price;

    public Founduh(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Founduh{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
