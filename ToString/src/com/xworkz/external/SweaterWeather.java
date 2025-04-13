package com.xworkz.external;

import com.xworkz.Internal.Book;

public class SweaterWeather extends Book {
    private String name;
    private String category;
    private int price;

    public SweaterWeather(String name,String category,int price){
        this.name=name;
        this.category=category;
        this.price=price;

    }

    @Override
    public int hashCode() {
        System.out.println("Default :" +super.hashCode());
        return 87;
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
            if (obj instanceof SweaterWeather) {
                SweaterWeather sweaterWeather = this;
                SweaterWeather sweaterWeather1 = (SweaterWeather) obj;
                if (sweaterWeather.name.equals(sweaterWeather1.name) && sweaterWeather.category.equals(sweaterWeather1.category) && sweaterWeather.price == sweaterWeather1.price) {
                    return true;
                }

            }
        }
        return false;
    }
}
