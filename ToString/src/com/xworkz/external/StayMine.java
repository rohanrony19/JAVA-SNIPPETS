package com.xworkz.external;

import com.xworkz.Internal.Book;

public class StayMine extends Book {
    private String name;
    private String category;
    private int price;

    public StayMine(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 85;
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
            if (obj instanceof StayMine) {
                StayMine stayMine = this;
                StayMine stayMine1 = (StayMine) obj;
                if (stayMine.name.equals(stayMine1.name) && stayMine.category.equals(stayMine1.category) && stayMine.price == stayMine1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
