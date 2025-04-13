package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Silentlove extends Book {
    private String name;
    private String category;
    private int price;

    public Silentlove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 80;
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
            if (obj instanceof Silentlove) {
                Silentlove silentlove = this;
                Silentlove silentlove1 = (Silentlove) obj;
                if (silentlove.name.equals(silentlove1.name) && silentlove.category.equals(silentlove1.category) && silentlove.price == silentlove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
