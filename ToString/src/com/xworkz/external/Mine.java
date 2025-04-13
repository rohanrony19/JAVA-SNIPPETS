package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Mine extends Book {
    private String name;
    private String category;
    private int price;

    public Mine(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 58;
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
            if (obj instanceof Mine) {
                Mine mine = this;
                Mine mine1 = (Mine) obj;
                if (mine.name.equals(mine1.name) && mine.category.equals(mine1.category) && mine.price == mine1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
