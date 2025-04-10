package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HisSmile extends Book {
    private String name;
    private String category;
    private int price;

    public HisSmile(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }
    public int hashcode(){
        System.out.println(super.hashCode());
        return 33;
    }

    @Override
    public String toString() {
        return
                "name='" + name +
                ", category='" + category +
                ", price=" + price
                ;
    }
}
