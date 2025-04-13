package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Heartless extends Book {
    private String name;
    private String category;
    private int price;

    public Heartless(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 26;
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
            if (obj instanceof Heartless) {
                Heartless heartless = this;
                Heartless heartless1 = (Heartless) obj;
                if (heartless.name.equals(heartless1.name) && heartless.category.equals(heartless1.category) && heartless.price == heartless1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
