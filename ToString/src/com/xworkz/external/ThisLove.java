package com.xworkz.external;

import com.xworkz.Internal.Book;

public class ThisLove extends Book {
    private String name;
    private String category;
    private int price;

    public ThisLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 91;
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
