package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Dearlove extends Book {
    private String name;
    private String category;
    private int price;

    public Dearlove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 9;
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
            if (obj instanceof Dearlove) {
                Dearlove dearlove = this;
                Dearlove dearlove1 = (Dearlove) obj;
                if (dearlove.name.equals(dearlove1.name) && dearlove.category.equals(dearlove1.category) && dearlove.price == dearlove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
