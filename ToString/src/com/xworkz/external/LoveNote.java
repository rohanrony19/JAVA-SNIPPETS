package com.xworkz.external;

import com.xworkz.Internal.Book;

public class LoveNote extends Book {
    private String name;
    private String category;
    private int price;

    public LoveNote(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 54;
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
            if (obj instanceof LoveNote) {
                LoveNote loveNote = this;
                LoveNote loveNote1 = (LoveNote) obj;
                if (loveNote.name.equals(loveNote1.name) && loveNote.category.equals(loveNote1.category) && loveNote.price == loveNote1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
