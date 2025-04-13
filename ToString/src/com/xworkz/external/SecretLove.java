package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SecretLove extends Book {
    private String name;
    private String category;
    private int price;

    public SecretLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 79;
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
            if (obj instanceof SecretLove) {
                SecretLove secretLove = this;
                SecretLove secretLove1 = (SecretLove) obj;
                if (secretLove.name.equals(secretLove1.name) && secretLove.category.equals(secretLove1.category) && secretLove.price == secretLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
