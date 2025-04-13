package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SweetVibe extends Book {
    private String name;
    private String category;
    private int price;

    public SweetVibe(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 89;
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
            if (obj instanceof SweetVibe) {
                SweetVibe sweetVibe = this;
                SweetVibe sweetVibe1 = (SweetVibe) obj;
                if (sweetVibe.name.equals(sweetVibe1.name) && sweetVibe.category.equals(sweetVibe1.category) && sweetVibe.price == sweetVibe1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
