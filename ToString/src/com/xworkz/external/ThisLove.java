package com.xworkz.external;

import com.xworkz.Internal.Book;

public class ThisLove extends Book {
    private String name;
    private String category;
    private int price;

    public ThisLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 91;
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
            if (obj instanceof ThisLove) {
                ThisLove thisLove = this;
                ThisLove thisLove1 = (ThisLove) obj;
                if (thisLove.name.equals(thisLove1.name) && thisLove.category.equals(thisLove1.category) && thisLove.price == thisLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
