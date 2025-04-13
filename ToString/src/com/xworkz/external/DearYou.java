package com.xworkz.external;

import com.xworkz.Internal.Book;

public class DearYou extends Book {
    private String name;
    private String category;
    private int price;

    public DearYou(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 11;
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
            if (obj instanceof DearYou) {
                DearYou dearYou = this;
                DearYou dearYou1 = (DearYou) obj;
                if (dearYou.name.equals(dearYou1.name) && dearYou.category.equals(dearYou1.category) && dearYou.price == dearYou1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
