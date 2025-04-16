package com.xworkz.interfaces.rule;

public class LibraryImpli implements Library {
    @Override
    public void open() {
        System.out.println("Library opened");
    }

    @Override
    public void issueBook() {
        System.out.println("Book issued");
    }

    @Override
    public void close() {
        System.out.println("Library closed");
    }
}
