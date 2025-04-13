package com.xworkz.external;

import com.xworkz.Internal.Book;

public class TextMe extends Book {
    private String name;
    private String category;
    private int price;

    public TextMe(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 90;
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
            if (obj instanceof TextMe) {
                TextMe textMe = this;
                TextMe textMe1 = (TextMe) obj;
                if (textMe.name.equals(textMe1.name) && textMe.category.equals(textMe1.category) && textMe.price == textMe1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
