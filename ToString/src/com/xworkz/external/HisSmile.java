package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HisSmile extends Book {
    private String name;
    private String category;
    private int price;

    public HisSmile(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }
    public int hashcode(){
        System.out.println(super.hashCode());
        return 33;
    }

    @Override
    public String toString() {
        return
                "name='" + name +
                ", category='" + category +
                ", price=" + price
                ;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof HisSmile) {
                HisSmile hisSmile = this;
                HisSmile hisSmile1 = (HisSmile) obj;
                if (hisSmile.name.equals(hisSmile1.name) && hisSmile.category.equals(hisSmile1.category) && hisSmile.price == hisSmile1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
