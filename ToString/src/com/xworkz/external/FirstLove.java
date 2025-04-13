package com.xworkz.external;

import com.xworkz.Internal.Book;

public class FirstLove extends Book {
    private String name;
    private String category;
    private int price;

    public FirstLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 18;
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
            if (obj instanceof FirstLove) {
                FirstLove firstLove = this;
                FirstLove firstLove1 = (FirstLove) obj;
                if (firstLove.name.equals(firstLove1.name) && firstLove.category.equals(firstLove1.category) && firstLove.price == firstLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
