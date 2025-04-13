package com.xworkz.external;

import com.xworkz.Internal.Book;

public class WarmHug extends Book {
    private String name;
    private String category;
    private int price;

    public WarmHug(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 95;
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
            if (obj instanceof WarmHug) {
                WarmHug warmHug = this;
                WarmHug warmHug1 = (WarmHug) obj;
                if (warmHug.name.equals(warmHug1.name) && warmHug.category.equals(warmHug1.category) && warmHug.price == warmHug1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
