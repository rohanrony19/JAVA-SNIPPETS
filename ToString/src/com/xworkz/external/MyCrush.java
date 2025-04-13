package com.xworkz.external;

import com.xworkz.Internal.Book;

public class MyCrush extends Book {
    private String name;
    private String category;
    private int price;

    public MyCrush(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }


    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 62;
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
            if (obj instanceof MyCrush) {
                MyCrush myCrush = this;
                MyCrush myCrush1 = (MyCrush) obj;
                if (myCrush.name.equals(myCrush1.name) && myCrush.category.equals(myCrush1.category) && myCrush.price == myCrush1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
