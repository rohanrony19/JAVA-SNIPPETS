package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LoveinParis extends Book {
    private String name;
    private String category;
    private int price;

    public LoveinParis(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default: " +super.hashCode());
        return 53;
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
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof LoveinParis){
                LoveinParis loveinParis=this;
                LoveinParis loveinParis1=(LoveinParis) obj;
                if(loveinParis.name.equals(loveinParis1.name) && loveinParis.category.equals(loveinParis1.category)&& loveinParis.price == loveinParis1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
