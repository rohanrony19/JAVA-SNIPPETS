package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Onlyme extends Book {
    private String name;
    private String category;
    private int price;

    public Onlyme(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 71;
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
            if (obj instanceof Onlyme) {
                Onlyme onlyme = this;
                Onlyme onlyme1 = (Onlyme) obj;
                if (onlyme.name.equals(onlyme1.name) && onlyme.category.equals(onlyme1.category) && onlyme.price == onlyme1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
