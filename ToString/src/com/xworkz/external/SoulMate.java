package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SoulMate extends Book {
    private String name;
    private String category;
    private int price;

    public SoulMate(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 83;
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
            if (obj instanceof SoulMate) {
                SoulMate soulMate = this;
                SoulMate soulMate1 = (SoulMate) obj;
                if (soulMate.name.equals(soulMate1.name) && soulMate.category.equals(soulMate1.category) && soulMate.price == soulMate1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
