package com.xworkz.external;

import com.xworkz.Internal.Book;

public class TwoHearts extends Book {
    private String name;
    private String category;
    private int price;

    public TwoHearts(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 94;
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
            if (obj instanceof TwoHearts) {
                TwoHearts twoHearts = this;
                TwoHearts twoHearts1 = (TwoHearts) obj;
                if (twoHearts.name.equals(twoHearts1.name) && twoHearts.category.equals(twoHearts1.category) && twoHearts.price == twoHearts1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
