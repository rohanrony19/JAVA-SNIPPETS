package com.xworkz.inheritence.internal.book;

public class Book {
    public Book() {
        System.out.println("Running non-arg constructor Book");
    }
    public void read() {
        System.out.println("Book is read");
    }
    public void write() {
        System.out.println("Book is written by an author");
    }
    public void publish() {
        System.out.println("Book is published");
    }
    public void genre() {
        System.out.println("Book has a genre");
    }
    public void pages() {
        System.out.println("Book has pages");
    }
}
