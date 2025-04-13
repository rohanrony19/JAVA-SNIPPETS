package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Newstart extends Book {
    private String name;
    private String category;
    private int price;

    public Newstart(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 64;
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
            if (obj instanceof Newstart) {
                Newstart newstart = this;
                Newstart newstart1 = (Newstart) obj;
                if (newstart.name.equals(newstart1.name) && newstart.category.equals(newstart1.category) && newstart.price == newstart1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
