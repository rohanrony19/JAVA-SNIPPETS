package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Ever extends Book {
    private String name;
    private String category;
    private int price;

    public Ever(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }
    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 16;
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
            if (obj instanceof Ever) {
                Ever ever = this;
                Ever ever1 = (Ever) obj;
                if (ever.name.equals(ever1.name) && ever.category.equals(ever1.category) && ever.price == ever1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
