package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HerVoice extends Book {
    private String name;
    private String category;
    private int price;

    public HerVoice(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 31;
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
            if (obj instanceof HerVoice) {
                HerVoice herVoice = this;
                HerVoice herVoice1 = (HerVoice) obj;
                if (herVoice.name.equals(herVoice1.name) && herVoice.category.equals(herVoice1.category) && herVoice.price == herVoice1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
