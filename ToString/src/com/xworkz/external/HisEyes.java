package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HisEyes extends Book {
    private String name;
    private String category;
    private int price;

    public HisEyes(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 32;
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
            if (obj instanceof HisEyes) {
                HisEyes hisEyes = this;
                HisEyes hisEyes1 = (HisEyes) obj;
                if (hisEyes.name.equals(hisEyes1.name) && hisEyes.category.equals(hisEyes1.category) && hisEyes.price == hisEyes1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
