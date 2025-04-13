package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Nights extends Book {
    private String name;
    private String category;
    private int price;

    public Nights(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 65;
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
            if (obj instanceof Nights) {
                Nights nights = this;
                Nights nights1 = (Nights) obj;
                if (nights.name.equals(nights1.name) && nights.category.equals(nights1.category) && nights.price == nights1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
