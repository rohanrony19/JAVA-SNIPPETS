package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HugMe extends Book {
    private String name;
    private String category;
    private int price;

    public HugMe(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 38;
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
            if (obj instanceof HugMe) {
                HugMe hugMe = this;
                HugMe hugMe1 = (HugMe) obj;
                if (hugMe.name.equals(hugMe1.name) && hugMe.category.equals(hugMe1.category) && hugMe.price == hugMe1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
