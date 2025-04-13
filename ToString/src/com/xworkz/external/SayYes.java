package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SayYes extends Book {
    private String name;
    private String category;
    private int price;

    public SayYes(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 77;
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
            if (obj instanceof SayYes) {
                SayYes sayYes = this;
                SayYes sayYes1 = (SayYes) obj;
                if (sayYes.name.equals(sayYes1.name) && sayYes.category.equals(sayYes1.category) && sayYes.price == sayYes1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
