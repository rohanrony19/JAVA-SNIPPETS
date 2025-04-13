package com.xworkz.external;

import com.xworkz.Internal.Book;

public class FirstSight extends Book {
    private String name;
    private String category;
    private int price;

    public FirstSight(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 19;
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
            if (obj instanceof FirstSight) {
                FirstSight firstSight = this;
                FirstSight firstSight1 = (FirstSight) obj;
                if (firstSight.name.equals(firstSight1.name) && firstSight.category.equals(firstSight1.category) && firstSight.price == firstSight1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
