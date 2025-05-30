package com.xworkz.external;

import com.xworkz.Internal.Book;

public class MyAngel extends Book {
    private String name;
    private String category;
    private int price;

    public MyAngel(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 60;
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
            if (obj instanceof MyAngel) {
                MyAngel myAngel = this;
                MyAngel myAngel1 = (MyAngel) obj;
                if (myAngel.name.equals(myAngel1.name) && myAngel.category.equals(myAngel1.category) && myAngel.price == myAngel1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
