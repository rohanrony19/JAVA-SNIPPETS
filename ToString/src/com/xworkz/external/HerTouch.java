package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HerTouch extends Book {
    private String name;
    private String category;
    private int price;

    public HerTouch(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 30;
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
            if (obj instanceof HerTouch) {
                HerTouch herTouch = this;
                HerTouch herTouch1 = (HerTouch) obj;
                if (herTouch.name.equals(herTouch1.name) && herTouch.category.equals(herTouch1.category) && herTouch.price == herTouch1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
