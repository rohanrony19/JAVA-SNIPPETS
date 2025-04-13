package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Callme extends Book {
    private String name;
    private String category;
    private int price;

    public Callme(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 5;
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
            if (obj instanceof Callme) {
                Callme callme = this;
                Callme callme1 = (Callme) obj;
                if (callme.name.equals(callme1.name) && callme.category.equals(callme1.category) && callme.price == callme1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
