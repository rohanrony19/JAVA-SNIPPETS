package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SecretLove extends Book {
    private String name;
    private String category;
    private int price;

    public SecretLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public String toString() {
        return "SecretLove{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
