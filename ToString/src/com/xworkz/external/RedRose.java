package com.xworkz.external;

import com.xworkz.Internal.Book;

public class RedRose extends Book {
    private String name;
    private String category;
    private int price;

    public RedRose(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 75;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price
                ;
    }
}
