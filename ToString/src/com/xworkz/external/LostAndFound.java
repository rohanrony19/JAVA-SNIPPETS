package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LostAndFound extends Book {
    private String name;
    private String category;
    private int price;

    public LostAndFound(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 48;
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
            if (obj instanceof LostAndFound) {
                LostAndFound lostAndFound = this;
                LostAndFound lostAndFound1 = (LostAndFound) obj;
                if (lostAndFound.name.equals(lostAndFound1.name) && lostAndFound.category.equals(lostAndFound1.category) && lostAndFound.price == lostAndFound1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
