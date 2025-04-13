package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LoveWins extends Book {
    private String name;
    private String category;
    private int price;

    public LoveWins(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 55;
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
            if (obj instanceof LoveWins) {
                LoveWins loveWins = this;
                LoveWins loveWins1 = (LoveWins) obj;
                if (loveWins.name.equals(loveWins1.name) && loveWins.category.equals(loveWins1.category) && loveWins.price == loveWins1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
