package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Heart extends Book {
    private String name;
    private String category;
    private int price;

    public Heart(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 24;
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
            if (obj instanceof Heart) {
                Heart heart = this;
                Heart heart1 = (Heart) obj;
                if (heart.name.equals(heart1.name) && heart.category.equals(heart1.category) && heart.price == heart1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
