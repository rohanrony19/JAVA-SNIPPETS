package com.xworkz.external;

import com.xworkz.Internal.Book;

public class OneWord extends Book {
    private String name;
    private String category;
    private int price;

    public OneWord(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 69;
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
            if (obj instanceof OneWord) {
                OneWord oneWord = this;
                OneWord oneWord1 = (OneWord) obj;
                if (oneWord.name.equals(oneWord1.name) && oneWord.category.equals(oneWord1.category) && oneWord.price == oneWord1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
