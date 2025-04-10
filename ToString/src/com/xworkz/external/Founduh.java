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
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 23;
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
