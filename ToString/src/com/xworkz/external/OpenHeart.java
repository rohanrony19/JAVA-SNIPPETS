package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OpenHeart extends Book {
    private String name;
    private String category;
    private int price;

    public OpenHeart(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 74;
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
            if (obj instanceof OpenHeart) {
                OpenHeart openHeart = this;
                OpenHeart openHeart1 = (OpenHeart) obj;
                if (openHeart.name.equals(openHeart1.name) && openHeart.category.equals(openHeart1.category) && openHeart.price == openHeart1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
