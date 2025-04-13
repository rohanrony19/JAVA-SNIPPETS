package com.xworkz.external;

import com.xworkz.Internal.Book;

public class TrueLove extends Book {
    private String name;
    private String category;
    private int price;

    public TrueLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 93;
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
            if (obj instanceof TrueLove) {
                TrueLove trueLove = this;
                TrueLove trueLove1 = (TrueLove) obj;
                if (trueLove.name.equals(trueLove1.name) && trueLove.category.equals(trueLove1.category) && trueLove.price == trueLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
