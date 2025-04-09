package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Love extends Book {
    private String name;
    private String category;
    private int price;

    public Love(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Love{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
