package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Dream extends Book {
    private String name;
    private String category;
    private int price;

    public Dream(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 12;
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
            if (obj instanceof Warmth) {
                Dream dream = this;
                Dream dream1 = (Dream) obj;
                if (dream.name.equals(dream.name) && dream.category.equals(dream1.category) && dream.price == dream1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
