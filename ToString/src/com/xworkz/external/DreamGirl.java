package com.xworkz.external;

import com.xworkz.Internal.Book;

public class DreamGirl extends Book {
    private String name;
    private String category;
    private int price;

    public DreamGirl(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 13;
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
            if (obj instanceof DreamGirl) {
                DreamGirl dreamGirl = this;
                DreamGirl dreamGirl1 = (DreamGirl) obj;
                if (dreamGirl.name.equals(dreamGirl1.name) && dreamGirl.category.equals(dreamGirl1.category) && dreamGirl.price == dreamGirl1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
