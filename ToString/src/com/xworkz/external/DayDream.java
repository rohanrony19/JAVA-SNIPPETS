package com.xworkz.external;

import com.xworkz.Internal.Book;

public class DayDream extends Book {
    private String name;
    private String category;
    private int price;

    public DayDream(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 7;
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
            if (obj instanceof DayDream) {
                DayDream dayDream = this;
                DayDream dayDream1 = (DayDream) obj;
                if (dayDream.name.equals(dayDream1.name) && dayDream.category.equals(dayDream1.category) && dayDream.price == dayDream1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
