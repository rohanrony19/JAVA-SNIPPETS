package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LoveAgain extends Book {
    private String name;
    private String category;
    private int price;

    public LoveAgain(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 51;
    }

    @Override
    public String toString() {
        return "LoveAgain{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof LoveAgain) {
                LoveAgain loveAgain = this;
                LoveAgain loveAgain1 = (LoveAgain) obj;
                if (loveAgain.name.equals(loveAgain1.name) && loveAgain.category.equals(loveAgain1.category) && loveAgain.price == loveAgain1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
