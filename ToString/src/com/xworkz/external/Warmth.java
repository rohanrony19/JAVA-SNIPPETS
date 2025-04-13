package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Warmth extends Book {
    private String name;
    private String category;
    private int price;

    public Warmth(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }
    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 97;
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
            if (obj instanceof Warmth){
                Warmth warmth=this;
                Warmth warmth1=(Warmth) obj;
                if (warmth.name.equals(warmth1.name) && warmth.category.equals(warmth1.category) && warmth.price==warmth1.price){
                    return true;
                }

            }
        }
        return false;
    }
}
