package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LostLove extends Book {
    private String name;
    private String category;
    private int price;

    public LostLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 49;
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
            if (obj instanceof LostLove) {
                LostLove lostLove = this;
                LostLove lostLove1 = (LostLove) obj;
                if (lostLove.name.equals(lostLove1.name) && lostLove.category.equals(lostLove1.category) && lostLove.price == lostLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
