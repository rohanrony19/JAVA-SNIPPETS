package com.xworkz.external;

import com.xworkz.Internal.Book;

public class ForYou extends Book {
    private String name;
    private String category;
    private int price;

    public ForYou(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 22;
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
        if (obj != null) {
            if (obj instanceof ForYou) {
                ForYou forYou = this;
                ForYou forYou1 = (ForYou) obj;
                if (forYou.name.equals(forYou1.name) && forYou.category.equals(forYou1.category) && forYou.price == forYou1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
