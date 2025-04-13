package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Latenight extends Book {
    private String name;
    private String category;
    private int price;

    public Latenight(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 46;
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
            if (obj instanceof Latenight) {
                Latenight latenight = this;
                Latenight latenight1 = (Latenight) obj;
                if (latenight.name.equals(latenight1.name) && latenight.category.equals(latenight1.category) && latenight.price == latenight1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
