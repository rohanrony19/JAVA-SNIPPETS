package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Withuh extends Book {
    private String name;
    private String category;
    private int price;

    public Withuh(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 98;
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
            if (obj instanceof Withuh) {
                Withuh withuh = this;
                Withuh withuh1 = (Withuh) obj;
                if (withuh.name.equals(withuh1.name) && withuh.category.equals(withuh1.category) && withuh.price == withuh1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
