package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Soul extends Book {
    private String name;
    private String category;
    private int price;

    public Soul(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 82;
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
            if (obj instanceof Soul) {
                Soul soul = this;
                Soul soul1 = (Soul) obj;
                if (soul.name.equals(soul1.name) && soul.category.equals(soul1.category) && soul.price == soul1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
