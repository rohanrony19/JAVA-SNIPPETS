package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Never extends Book {
    private String name;
    private String category;
    private int price;

    public Never(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default: " + super.hashCode());
        return 63;
    }

    @Override
    public String toString() {
        return
                "name='" + name +
                        ", category='" + category + '\'' +
                        ", price=" + price + '\''
                ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Never) {
                Never never = this;
                Never never1 = (Never) obj;
                if (never.name.equals(never1.name) && never.category.equals(never1.category) && never.price == never1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
