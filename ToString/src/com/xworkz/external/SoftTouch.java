package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SoftTouch extends Book {
    private String name;
    private String category;
    private int price;

    public SoftTouch(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 81;
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
            if (obj instanceof SoftTouch) {
                SoftTouch softTouch = this;
                SoftTouch softTouch1 = (SoftTouch) obj;
                if (softTouch.name.equals(softTouch1.name) && softTouch.category.equals(softTouch1.category) && softTouch.price == softTouch1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
