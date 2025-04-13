package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Trueheart extends Book {
    private String name;
    private String category;
    private int price;

    public Trueheart(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 92;
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
            if (obj instanceof Trueheart) {
                Trueheart trueheart = this;
                Trueheart trueheart1 = (Trueheart) obj;
                if (trueheart.name.equals(trueheart1.name) && trueheart.category.equals(trueheart1.category) && trueheart.price == trueheart1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
