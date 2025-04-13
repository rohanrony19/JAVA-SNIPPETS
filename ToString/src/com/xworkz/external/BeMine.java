package com.xworkz.external;

import com.xworkz.Internal.Book;

public class BeMine extends Book {
    private String name;
    private String category;
    private int price;

    public BeMine(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 3;
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
            if (obj instanceof BeMine) {
                BeMine beMine = this;
                BeMine beMine1 = (BeMine) obj;
                if (beMine.name.equals(beMine1.name) && beMine.category.equals(beMine1.category) && beMine.price == beMine1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
