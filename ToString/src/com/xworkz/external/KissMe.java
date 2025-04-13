package com.xworkz.external;

import com.xworkz.Internal.Book;

public class KissMe extends Book {
    private String name;
    private String category;
    private int price;

    public KissMe(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 43;
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
            if (obj instanceof KissMe) {
                KissMe kissMe = this;
                KissMe kissMe1 = (KissMe) obj;
                if (kissMe.name.equals(kissMe1.name) && kissMe.category.equals(kissMe1.category) && kissMe.price == kissMe1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
