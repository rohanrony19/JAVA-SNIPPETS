package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Lost extends Book {
    private String name;
    private String category;
    private int price;

    public Lost(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }
    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 47;
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
            if (obj instanceof Lost) {
                Lost lost = this;
                Lost lost1 = (Lost) obj;
                if (lost.name.equals(lost1.name) && lost.category.equals(lost1.category) && lost.price == lost1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
