package com.xworkz.external;

import com.xworkz.Internal.Book;

import java.util.Objects;

public class Allyours extends Book {
    private String name;
    private String category;
    private int price;

    public Allyours(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 1;
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
            if (obj instanceof Allyours) {
                Allyours allyours = this;
                Allyours allyours1 = (Allyours) obj;
                if (allyours.name.equals(allyours1.name) && allyours.category.equals(allyours1.category) && allyours.price == allyours1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
