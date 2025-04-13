package com.xworkz.external;

import com.xworkz.Internal.Book;

public class RedRose extends Book {
    private String name;
    private String category;
    private int price;

    public RedRose(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 75;
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
            if (obj instanceof RedRose) {
                RedRose redRose = this;
                RedRose redRose1 = (RedRose) obj;
                if (redRose.name.equals(redRose1.name) && redRose.category.equals(redRose1.category) && redRose.price == redRose1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
