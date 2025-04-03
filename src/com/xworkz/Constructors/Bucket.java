package com.xworkz.Constructors;

public class Bucket {
    static int num;

    public void setBucket(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Bucket obj = new Bucket();
        obj.setBucket(69);
            System.out.println("num:" + num);
        }
    }
