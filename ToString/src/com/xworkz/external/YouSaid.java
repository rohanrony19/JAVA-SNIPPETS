package com.xworkz.external;

import com.xworkz.Internal.Book;

public class YouSaid extends Book {
    private String name;
    private String category;
    private int price;

    public YouSaid(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 100;
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
            if (obj instanceof YouSaid) {
                YouSaid youSaid = this;
                YouSaid youSaid1 = (YouSaid) obj;
                if (youSaid.name.equals(youSaid1.name) && youSaid.category.equals(youSaid1.category) && youSaid.price == youSaid1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
