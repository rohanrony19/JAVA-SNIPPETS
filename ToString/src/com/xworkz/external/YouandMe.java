package com.xworkz.external;

import com.xworkz.Internal.Book;

public class YouandMe extends Book {
    private String name;
    private String category;
    private int price;

    public YouandMe(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 99;
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
            if (obj instanceof YouandMe) {
                YouandMe youandMe = this;
                YouandMe youandMe1 = (YouandMe) obj;
                if (youandMe.name.equals(youandMe1.name) && youandMe.category.equals(youandMe1.category) && youandMe.price == youandMe1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
