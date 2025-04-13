package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OnlyLove extends Book {
    private String name;
    private String category;
    private int price;

    public OnlyLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 70;
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
            if (obj instanceof OnlyLove) {
                OnlyLove onlyLove = this;
                OnlyLove onlyLove1 = (OnlyLove) obj;
                if (onlyLove.name.equals(onlyLove1.name) && onlyLove.category.equals(onlyLove1.category) && onlyLove.price == onlyLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
