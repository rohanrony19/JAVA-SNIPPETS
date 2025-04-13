package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Forever extends Book {
    private String name;
    private String category;
    private int price;

    public Forever(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 20;
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
            if (obj instanceof Forever) {
                Forever forever = this;
                Forever forever1 = (Forever) obj;
                if (forever.name.equals(forever1.name) && forever.category.equals(forever1.category) && forever.price == forever1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
