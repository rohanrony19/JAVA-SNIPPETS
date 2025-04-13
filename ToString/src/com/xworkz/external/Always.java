package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Always extends Book {
    private String name;
    private String category;
    private int price;

    public Always(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 2;
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
            if (obj instanceof Always) {
                Always always = this;
                Always always1 = (Always) obj;
                if (always.name.equals(always1.name) && always.category.equals(always1.category) && always.price == always1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
