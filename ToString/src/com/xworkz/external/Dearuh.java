package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Dearuh extends Book {
    private String name;
    private String category;
    private int price;

    public Dearuh(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 10;
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
            if (obj instanceof Dearuh) {
                Dearuh dearuh = this;
                Dearuh dearuh1 = (Dearuh) obj;
                if (dearuh.name.equals(dearuh1.name) && dearuh.category.equals(dearuh1.category) && dearuh.price == dearuh1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
