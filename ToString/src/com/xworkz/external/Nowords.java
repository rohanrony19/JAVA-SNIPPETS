package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Nowords extends Book {
    private String name;
    private String category;
    private int price;

    public Nowords(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 66;
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
            if (obj instanceof Nowords) {
                Nowords nowords = this;
                Nowords nowords1 = (Nowords) obj;
                if (nowords.name.equals(nowords1.name) && nowords.category.equals(nowords1.category) && nowords.price == nowords1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
