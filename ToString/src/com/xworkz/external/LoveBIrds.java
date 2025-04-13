package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LoveBIrds extends Book {
    private String name;
    private String category;
    private int price;

    public LoveBIrds(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 52;
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
            if (obj instanceof LoveBIrds) {
                LoveBIrds loveBIrds = this;
                LoveBIrds loveBIrds1 = (LoveBIrds) obj;
                if (loveBIrds.name.equals(loveBIrds1.name) && loveBIrds.category.equals(loveBIrds1.category) && loveBIrds.price == loveBIrds1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
