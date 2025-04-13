package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LastCall extends Book {
    private String name;
    private String category;
    private int price;

    public LastCall(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 44;
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
            if (obj instanceof LastCall) {
                LastCall lastCall = this;
                LastCall lastCall1 = (LastCall) obj;
                if (lastCall.name.equals(lastCall1.name) && lastCall.category.equals(lastCall1.category) && lastCall.price == lastCall1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
