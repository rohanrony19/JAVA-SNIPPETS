package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SweatHeart extends Book {
    private String name;
    private String category;
    private int price;

    public SweatHeart(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 88;
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
            if (obj instanceof SweatHeart) {
                SweatHeart sweatHeart = this;
                SweatHeart sweatHeart1 = (SweatHeart) obj;
                if (sweatHeart.name.equals(sweatHeart1.name) && sweatHeart.category.equals(sweatHeart1.category) && sweatHeart.price == sweatHeart1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
