package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.book.Book;
import com.xworkz.inheritence.internal.book.Novel;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Novel();
        book.read();
        book.write();
        book.publish();
        book.genre();
        book.pages();

        System.out.println("-----------");

        Novel novel = new Novel();
        novel.read();
        novel.write();
        novel.publish();
        novel.genre();
        novel.pages();
    }
}
