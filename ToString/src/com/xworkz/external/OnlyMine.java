package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OnlyMine extends Book {
    private String name;
    private String category;
    private int price;

    public OnlyMine(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 72;
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
            if (obj instanceof OnlyMine) {
                OnlyMine onlyMine = this;
                OnlyMine onlyMine1 = (OnlyMine) obj;
                if (onlyMine.name.equals(onlyMine1.name) && onlyMine.category.equals(onlyMine1.category) && onlyMine.price == onlyMine1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
