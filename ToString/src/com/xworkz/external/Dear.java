package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Dear extends Book {
    private String name;
    private String category;
    private int price;

    public Dear(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 8;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price
                ;
    }@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Dear) {
                Dear dear = this;
                Dear dear1 = (Dear) obj;
                if (dear.name.equals(dear1.name) && dear.category.equals(dear1.category) && dear.price == dear1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
