package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HerEyes extends Book {
    private String name;
    private String category;
    private int price;

    public HerEyes(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 28;
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
            if (obj instanceof HerEyes) {
                HerEyes herEyes = this;
                HerEyes herEyes1 = (HerEyes) obj;
                if (herEyes.name.equals(herEyes1.name) && herEyes.category.equals(herEyes1.category) && herEyes.price == herEyes1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
