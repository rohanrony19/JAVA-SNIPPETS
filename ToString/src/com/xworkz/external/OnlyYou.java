package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OnlyYou extends Book {
    private String name;
    private String category;
    private int price;

    public OnlyYou(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 73;
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
            if (obj instanceof OnlyYou) {
                OnlyYou onlyYou = this;
                OnlyYou onlyYou1 = (OnlyYou) obj;
                if (onlyYou.name.equals(onlyYou1.name) && onlyYou.category.equals(onlyYou1.category) && onlyYou.price == onlyYou1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
