package com.xworkz.external;

import com.xworkz.Internal.Book;

public class MissYou extends Book {
    private String name;
    private String category;
    private int price;

    public MissYou(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 59;
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
            if (obj instanceof MissYou) {
                MissYou missYou = this;
                MissYou missYou1 = (MissYou) obj;
                if (missYou.name.equals(missYou1.name) && missYou.category.equals(missYou1.category) && missYou.price == missYou1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
