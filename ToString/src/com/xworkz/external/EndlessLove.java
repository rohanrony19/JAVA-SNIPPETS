package com.xworkz.external;

import com.xworkz.Internal.Book;

public class EndlessLove extends Book {
    private String name;
    private String category;
    private int price;

    public EndlessLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 15;
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
            if (obj instanceof EndlessLove) {
                EndlessLove endlessLove = this;
                EndlessLove endlessLove1 = (EndlessLove) obj;
                if (endlessLove.name.equals(endlessLove1.name) && endlessLove.category.equals(endlessLove1.category) && endlessLove.price == endlessLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
