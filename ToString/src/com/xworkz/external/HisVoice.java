package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HisVoice extends Book {
    private String name;
    private String category;
    private int price;

    public HisVoice(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 34;
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
            if (obj instanceof HisVoice) {
                HisVoice hisVoice = this;
                HisVoice hisVoice1 = (HisVoice) obj;
                if (hisVoice.name.equals(hisVoice1.name) && hisVoice.category.equals(hisVoice1.category) && hisVoice.price == hisVoice1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
