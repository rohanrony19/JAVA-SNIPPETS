package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Justus extends Book {
    private String name;
    private String category;
    private int price;

    public Justus(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 42;
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
            if (obj instanceof Justus) {
                Justus justus = this;
                Justus justus1 = (Justus) obj;
                if (justus.name.equals(justus1.name) && justus.category.equals(justus1.category) && justus.price == justus1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
