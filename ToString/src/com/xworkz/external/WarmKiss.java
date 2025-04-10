package com.xworkz.external;

import com.xworkz.Internal.Book;

public class WarmKiss extends Book {
    private String name;
    private String category;
    private int price;

    public WarmKiss(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 96;
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
