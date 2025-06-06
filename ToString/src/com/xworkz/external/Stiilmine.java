package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Stiilmine extends Book {
    private String name;
    private String category;
    private int price;

    public Stiilmine(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 86;
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
            if (obj instanceof Stiilmine) {
                Stiilmine stiilmine = this;
                Stiilmine stiilmine1 = (Stiilmine) obj;
                if (stiilmine.name.equals(stiilmine1.name) && stiilmine.category.equals(stiilmine1.category) && stiilmine.price == stiilmine1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
