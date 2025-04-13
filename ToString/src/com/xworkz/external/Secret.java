package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Secret extends Book {
    private String name;
    private String category;
    private int price;

    public Secret(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 78;
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
            if (obj instanceof Secret) {
                Secret secret = this;
                Secret secret1 = (Secret) obj;
                if (secret.name.equals(secret1.name) && secret.category.equals(secret1.category) && secret.price == secret1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
