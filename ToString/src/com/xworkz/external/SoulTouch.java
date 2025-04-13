package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SoulTouch extends Book {
    private String name;
    private String category;
    private int price;

    public SoulTouch(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 84;
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
            if (obj instanceof SoulTouch) {
                SoulTouch soulTouch = this;
                SoulTouch soulTouch1 = (SoulTouch) obj;
                if (soulTouch.name.equals(soulTouch1.name) && soulTouch.category.equals(soulTouch1.category) && soulTouch.price == soulTouch1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
