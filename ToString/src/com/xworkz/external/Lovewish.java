package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Lovewish extends Book {
    private String name;
    private String category;
    private int price;

    public Lovewish(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 56;
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
            if (obj instanceof Lovewish) {
                Lovewish lovewish = this;
                Lovewish lovewish1 = (Lovewish) obj;
                if (lovewish.name.equals(lovewish1.name) && lovewish.category.equals(lovewish1.category) && lovewish.price == lovewish1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
