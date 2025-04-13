package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OneKiss extends Book {
    private String name;
    private String category;
    private int price;

    public OneKiss(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 68;
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
            if (obj instanceof OneKiss) {
                OneKiss oneKiss = this;
                OneKiss oneKiss1 = (OneKiss) obj;
                if (oneKiss.name.equals(oneKiss1.name) && oneKiss.category.equals(oneKiss1.category) && oneKiss.price == oneKiss1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
