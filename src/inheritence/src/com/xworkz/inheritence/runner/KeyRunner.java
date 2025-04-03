package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.lock.Key;
import com.xworkz.inheritence.internal.lock.Lock;

public class KeyRunner {
    public static void main(String[] args) {
        Key key=new Lock();
        key.big();
        key.close();
        key.open();
        key.white();
        key.small();

        System.out.println("-----");
        Lock lock=new Lock();
        lock.big();
        lock.close();
        lock.open();
        lock.white();
        lock.small();
    }
}
