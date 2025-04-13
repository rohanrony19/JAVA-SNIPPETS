package com.xworkz.external;

import com.xworkz.Internal.Book;

public class Itstartswithus extends Book {
    private String name;
    private String category;
    private int price;

    public Itstartswithus(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }
    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 41;
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
            if (obj instanceof Itstartswithus) {
                Itstartswithus itstartswithus = this;
                Itstartswithus itstartswithus1 = (Itstartswithus) obj;
                if (itstartswithus.name.equals(itstartswithus1.name) && itstartswithus.category.equals(itstartswithus1.category) && itstartswithus.price == itstartswithus1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
