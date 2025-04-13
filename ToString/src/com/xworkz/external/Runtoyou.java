package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Runtoyou extends Book {
    private String name;
    private String category;
    private int price;

    public Runtoyou(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 76;
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
            if (obj instanceof Runtoyou) {
                Runtoyou runtoyou = this;
                Runtoyou runtoyou1 = (Runtoyou) obj;
                if (runtoyou.name.equals(runtoyou1.name) && runtoyou.category.equals(runtoyou1.category) && runtoyou.price == runtoyou1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
