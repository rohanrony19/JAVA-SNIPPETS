package com.xworkz.external;

import com.xworkz.Internal.Book;

public class MyBoo extends Book {
    private String name;
    private String category;
    private int price;

    public MyBoo(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 61;
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
            if (obj instanceof MyBoo) {
                MyBoo myBoo = this;
                MyBoo myBoo1 = (MyBoo) obj;
                if (myBoo.name.equals(myBoo1.name) && myBoo.category.equals(myBoo1.category) && myBoo.price == myBoo1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
