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
    public int hashCode() {
        System.out.println("manual :"+super.hashCode());
        return 50;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price
                ;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Love){
                Love love=this;
                Love love1=(Love) obj;
                if (love.name.equals(love1.name) && love.category.equals(love1.category) && love.price==love1.price){
                    return true;
                }

            }
        }
        return false;
        }
}
