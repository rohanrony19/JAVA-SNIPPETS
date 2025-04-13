package com.xworkz.external;

import com.xworkz.Internal.Book;

public class InLove extends Book {
    private String name;
    private String category;
    private int price;

    public InLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 39;
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
            if (obj instanceof InLove) {
                InLove inLove = this;
                InLove inLove1 = (InLove) obj;
                if (inLove.name.equals(inLove1.name) && inLove.category.equals(inLove1.category) && inLove.price == inLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
