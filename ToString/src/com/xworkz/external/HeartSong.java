package com.xworkz.external;

import com.xworkz.Internal.Book;

public class HeartSong extends Book {
    private String name;
    private String category;
    private int price;

    public HeartSong(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 27;
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
            if (obj instanceof HeartSong) {
                HeartSong heartSong = this;
                HeartSong heartSong1 = (HeartSong) obj;
                if (heartSong.name.equals(heartSong1.name) && heartSong.category.equals(heartSong1.category) && heartSong.price == heartSong1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
