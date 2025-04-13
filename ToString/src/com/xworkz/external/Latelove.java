package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Latelove extends Book {
    private String name;
    private String category;
    private int price;

    public Latelove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 45;
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
            if (obj instanceof Latelove) {
                Latelove latelove = this;
                Latelove latelove1 = (Latelove) obj;
                if (latelove.name.equals(latelove1.name) && latelove.category.equals(latelove1.category) && latelove.price == latelove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
