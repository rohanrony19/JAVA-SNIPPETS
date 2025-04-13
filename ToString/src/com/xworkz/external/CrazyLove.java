package com.xworkz.external;

import com.xworkz.Internal.Book;

public class CrazyLove extends Book {
    private String name;
    private String category;
    private int price;

    public CrazyLove(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 6;
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
            if (obj instanceof CrazyLove) {
                CrazyLove crazyLove = this;
                CrazyLove crazyLove1 = (CrazyLove) obj;
                if (crazyLove.name.equals(crazyLove1.name) && crazyLove.category.equals(crazyLove1.category) && crazyLove.price == crazyLove1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
